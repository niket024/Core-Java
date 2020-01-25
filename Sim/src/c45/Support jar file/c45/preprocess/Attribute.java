/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package c45.preprocess;


import java.text.SimpleDateFormat;
import java.util.Hashtable;
import java.util.Properties;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.text.ParseException;
import java.util.Date;

/**
 *
 * @author brindha
 */
public class Attribute {
 /** Constant set for numeric attributes. */
  public static final int NUMERIC = 0;

  /** Constant set for nominal attributes. */
  public static final int NOMINAL = 1;

  /** Constant set for attributes with string values. */
  public static final int STRING = 2;

  /** Constant set for attributes with date values. */
  public static final int DATE = 3;

  /** Constant set for symbolic attributes. */
  public static final int ORDERING_SYMBOLIC = 0;

  /** Constant set for ordered attributes. */
  public static final int ORDERING_ORDERED  = 1;

  /** Constant set for modulo-ordered attributes. */
  public static final int ORDERING_MODULO   = 2;

  /** The keyword used to denote the start of an arff attribute declaration */
  static String ARFF_ATTRIBUTE = "@attribute";

  /** A keyword used to denote a numeric attribute */
  static String ARFF_ATTRIBUTE_INTEGER = "integer";

  /** A keyword used to denote a numeric attribute */
  static String ARFF_ATTRIBUTE_REAL = "real";

  /** A keyword used to denote a numeric attribute */
  static String ARFF_ATTRIBUTE_NUMERIC = "numeric";

  /** The keyword used to denote a string attribute */
  static String ARFF_ATTRIBUTE_STRING = "string";

  /** The keyword used to denote a date attribute */
  static String ARFF_ATTRIBUTE_DATE = "date";

  /** Strings longer than this will be stored compressed. */
  private static final int STRING_COMPRESS_THRESHOLD = 200;

  /** The attribute's name. */
  private /*@ spec_public non_null @*/ String m_Name;

  /** The attribute's type. */
  private /*@ spec_public @*/ int m_Type;
  /*@ invariant m_Type == NUMERIC ||
                m_Type == DATE ||
                m_Type == STRING ||
                m_Type == NOMINAL;
  */

  /** The attribute's values (if nominal or string). */
  private /*@ spec_public @*/ FastVector m_Values;

  /** Mapping of values to indices (if nominal or string). */
  private Hashtable m_Hashtable;

  /** Date format specification for date attributes */
  private SimpleDateFormat m_DateFormat;

  /** The attribute's index. */
  private /*@ spec_public @*/ int m_Index;

  /** The attribute's metadata. */
  private ProtectedProperties m_Metadata;

  /** The attribute's ordering. */
  private int m_Ordering;

  /** Whether the attribute is regular. */
  private boolean m_IsRegular;

  /** Whether the attribute is averagable. */
  private boolean m_IsAveragable;

  /** Whether the attribute has a zeropoint. */
  private boolean m_HasZeropoint;

  /** The attribute's weight. */
  private double m_Weight;

  /** The attribute's lower numeric bound. */
  private double m_LowerBound;

  /** Whether the lower bound is open. */
  private boolean m_LowerBoundIsOpen;

  /** The attribute's upper numeric bound. */
  private double m_UpperBound;

  /** Whether the upper bound is open */
  private boolean m_UpperBoundIsOpen;

/**
   * Constructor for a numeric attribute.
   *
   * @param attributeName the name for the attribute
   */
  //@ requires attributeName != null;
  //@ ensures  m_Name == attributeName;
  public Attribute(String attributeName) {

    this(attributeName, new ProtectedProperties(new Properties()));
  }


   /**
   * Returns a value of a nominal or string attribute.
   * Returns an empty string if the attribute is neither
   * nominal nor a string attribute.
   *
   * @param valIndex the value's index
   * @return the attribute's value as a string
   */
  public final /*@ non_null pure @*/ String value(int valIndex) {

    if (!isNominal() && !isString()) {
      return "";
    } else {
      Object val = m_Values.elementAt(valIndex);

      // If we're storing strings compressed, uncompress it.
    /* 8888888888888 if (val instanceof SerializedObject) {
        val = ((SerializedObject)val).getObject();
      }*/
      return (String) val;
    }
  }

   /**
   * Constructor for a date attribute, where metadata is supplied.
   *
   * @param attributeName the name for the attribute
   * @param dateFormat a string suitable for use with
   * SimpleDateFormatter for parsing dates.
   * @param metadata the attribute's properties
   */
  //@ requires attributeName != null;
  //@ requires dateFormat != null;
  //@ requires metadata != null;
  //@ ensures  m_Name == attributeName;
  public Attribute(String attributeName, String dateFormat,
		   ProtectedProperties metadata) {

    m_Name = attributeName;
    m_Index = -1;
    m_Values = null;
    m_Hashtable = null;
    m_Type = DATE;
    if (dateFormat != null) {
      m_DateFormat = new SimpleDateFormat(dateFormat);
    } else {
      m_DateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
    }
    m_DateFormat.setLenient(false);
    setMetadata(metadata);
  }
   /**
   * Constructor for a numeric attribute with a particular index.
   *
   * @param attributeName the name for the attribute
   * @param index the attribute's index
   */
  //@ requires attributeName != null;
  //@ requires index >= 0;
  //@ ensures  m_Name == attributeName;
  //@ ensures  m_Index == index;
  Attribute(String attributeName, int index) {

    this(attributeName);
    m_Index = index;
  }
 /**
   * Returns the index of a given attribute value. (The index of
   * the first occurence of this value.)
   *
   * @param value the value for which the index is to be returned
   * @return the index of the given attribute value if attribute
   * is nominal or a string, -1 if it is numeric or the value
   * can't be found
   */
  public final int indexOfValue(String value) {

    if (!isNominal() && !isString())
      return -1;
    Object store = value;
    if (value.length() > STRING_COMPRESS_THRESHOLD) {
      try {
        store = new SerializedObject(value, true);
      } catch (Exception ex) {
        System.err.println("Couldn't compress string attribute value -"
                           + " searching uncompressed.");
      }
    }
    Integer val = (Integer)m_Hashtable.get(store);
    if (val == null) return -1;
    else return val.intValue();
  }

    /**
   * Constructor for a date attribute.
   *
   * @param attributeName the name for the attribute
   * @param dateFormat a string suitable for use with
   * SimpleDateFormatter for parsing dates.
   */
  //@ requires attributeName != null;
  //@ requires dateFormat != null;
  //@ ensures  m_Name == attributeName;
  public Attribute(String attributeName, String dateFormat) {

    this(attributeName, dateFormat,
	 new ProtectedProperties(new Properties()));
  }

  /**
   * Returns the attribute's type as an integer.
   *
   * @return the attribute's type.
   */
  //@ ensures \result == m_Type;
  public final /*@ pure @*/ int type() {

    return m_Type;
  }

  /**
   * Test if the attribute is nominal.
   *
   * @return true if the attribute is nominal
   */
  //@ ensures \result <==> (m_Type == NOMINAL);
  public final /*@ pure @*/ boolean isNominal() {
  //    System.out.println("m_Type"+m_Type);

    return (m_Type == NOMINAL);
  }


   /**
   * Constructor for nominal attributes and string attributes.
   * If a null vector of attribute values is passed to the method,
   * the attribute is assumed to be a string.
   *
   * @param attributeName the name for the attribute
   * @param attributeValues a vector of strings denoting the
   * attribute values. Null if the attribute is a string attribute.
   */
  //@ requires attributeName != null;
  //@ ensures  m_Name == attributeName;
  public Attribute(String attributeName,
		   FastVector attributeValues) {

    this(attributeName, attributeValues,
	 new ProtectedProperties(new Properties()));
  }
   /**
   * Constructor for nominal attributes and string attributes, where
   * metadata is supplied. If a null vector of attribute values is passed
   * to the method, the attribute is assumed to be a string.
   *
   * @param attributeName the name for the attribute
   * @param attributeValues a vector of strings denoting the
   * attribute values. Null if the attribute is a string attribute.
   * @param metadata the attribute's properties
   */
  //@ requires attributeName != null;
  //@ requires metadata != null;
  /*@ ensures  m_Name == attributeName;
      ensures  m_Index == -1;
      ensures  attributeValues == null && m_Type == STRING
            || attributeValues != null && m_Type == NOMINAL
                  && m_Values.size() == attributeValues.size();
      signals (IllegalArgumentException ex)
                 (* if duplicate strings in attributeValues *);
  */
  public Attribute(String attributeName,
		   FastVector attributeValues,
		   ProtectedProperties metadata) {

    m_Name = attributeName;
    m_Index = -1;
    if (attributeValues == null) {
      m_Values = new FastVector();
      m_Hashtable = new Hashtable();
      m_Type = STRING;
    } else {
      m_Values = new FastVector(attributeValues.size());
      m_Hashtable = new Hashtable(attributeValues.size());
      for (int i = 0; i < attributeValues.size(); i++) {
	Object store = attributeValues.elementAt(i);
	if (((String)store).length() > STRING_COMPRESS_THRESHOLD) {
	  try {
	    store = new SerializedObject(attributeValues.elementAt(i), true);
	  } catch (Exception ex) {
	    System.err.println("Couldn't compress nominal attribute value -"
			       + " storing uncompressed.");
	  }
	}
	if (m_Hashtable.containsKey(store)) {
	  throw new IllegalArgumentException("A nominal attribute (" +
					     attributeName + ") cannot"
					     + " have duplicate labels (" + store + ").");
	}
	m_Values.addElement(store);
	m_Hashtable.put(store, new Integer(i));
      }
      m_Type = NOMINAL;
    }
    setMetadata(metadata);
  }

  
   /**
   * Sets the index of this attribute.
   *
   * @param the index of this attribute
   */
  //@ requires 0 <= index;
  //@ assignable m_Index;
  //@ ensures m_Index == index;
  final void setIndex(int index) {

    m_Index = index;
  }
   /**
   * Constructor for a numeric attribute, where metadata is supplied.
   *
   * @param attributeName the name for the attribute
   * @param metadata the attribute's properties
   */
  //@ requires attributeName != null;
  //@ requires metadata != null;
  //@ ensures  m_Name == attributeName;
  public Attribute(String attributeName, ProtectedProperties metadata) {

    m_Name = attributeName;
    m_Index = -1;
    m_Values = null;
    m_Hashtable = null;
    m_Type = NUMERIC;
    setMetadata(metadata);
  }
  
   /**
   * Returns the index of this attribute.
   *
   * @return the index of this attribute
   */
  //@ ensures \result == m_Index;
  public final /*@ pure @*/ int index() {

    return m_Index;
  }


   /**
   * Constructor for nominal attributes and string attributes with
   * a particular index.
   * If a null vector of attribute values is passed to the method,
   * the attribute is assumed to be a string.
   *
   * @param attributeName the name for the attribute
   * @param attributeValues a vector of strings denoting the attribute values.
   * Null if the attribute is a string attribute.
   * @param index the attribute's index
   */
  //@ requires attributeName != null;
  //@ requires index >= 0;
  //@ ensures  m_Name == attributeName;
  //@ ensures  m_Index == index;
  Attribute(String attributeName, FastVector attributeValues,
	    int index) {

    this(attributeName, attributeValues);
    m_Index = index;
  }
  /**
   * Constructor for date attributes with a particular index.
   *
   * @param attributeName the name for the attribute
   * @param dateFormat a string suitable for use with
   * SimpleDateFormatter for parsing dates.  Null for a default format
   * string.
   * @param index the attribute's index
   */
  //@ requires attributeName != null;
  //@ requires index >= 0;
  //@ ensures  m_Name == attributeName;
  //@ ensures  m_Index == index;
  Attribute(String attributeName, String dateFormat,
	    int index) {

    this(attributeName, dateFormat);
    m_Index = index;
  }
 /**
   * Sets the metadata for the attribute. Processes the strings stored in the
   * metadata of the attribute so that the properties can be set up for the
   * easy-access metadata methods. Any strings sought that are omitted will
   * cause default values to be set.
   *
   * The following properties are recognised:
   * ordering, averageable, zeropoint, regular, weight, and range.
   *
   * All other properties can be queried and handled appropriately by classes
   * calling the getMetadata() method.
   *
   * @param metadata the metadata
   * @exception IllegalArgumentException if the properties are not consistent
   */
  //@ requires metadata != null;

 /**
   * Adds a string value to the list of valid strings for attributes
   * of type STRING and returns the index of the string.
   *
   * @param value The string value to add
   * @return the index assigned to the string, or -1 if the attribute is not
   * of type Attribute.STRING
   */
  /*@ requires value != null;
      ensures  isString() && 0 <= \result && \result < m_Values.size() ||
             ! isString() && \result == -1;
  */
  public int addStringValue(String value) {

    if (!isString()) {
      return -1;
    }
    Object store = value;

    if (value.length() > STRING_COMPRESS_THRESHOLD) {
      try {
        store = new SerializedObject(value, true);
      } catch (Exception ex) {
        System.err.println("Couldn't compress string attribute value -"
                           + " storing uncompressed.");
      }
    }
    Integer index = (Integer)m_Hashtable.get(store);
    if (index != null) {
      return index.intValue();
    } else {
      int intIndex = m_Values.size();
      m_Values.addElement(store);
      m_Hashtable.put(store, new Integer(intIndex));
      return intIndex;
    }
  }
/**
   * Tests if the attribute is a string.
   *
   * @return true if the attribute is a string
   */
  //@ ensures \result <==> (m_Type == STRING);
  public final /*@ pure @*/ boolean isString() {

    return (m_Type == STRING);
  }
  //@ requires isDate();
  //@ requires string != null;
  public double parseDate(String string) throws ParseException {
    switch (m_Type) {
    case DATE:
      long time = m_DateFormat.parse(string).getTime();
      // TODO put in a safety check here if we can't store the value in a double.
      return (double)time;
    default:
      throw new IllegalArgumentException("Can only parse date values for date"
                                         + " attributes!");
    }
  }
 /**
   * Returns the number of attribute values. Returns 0 for numeric attributes.
   *
   * @return the number of attribute values
   */
  public final /*@ pure @*/ int numValues() {

    if (!isNominal() && !isString()) {
      return 0;
    } else {
      return m_Values.size();
    }
  }

   /**
   * Returns the attribute's name.
   *
   * @return the attribute's name as a string
   */
  //@ ensures \result == m_Name;
  public final /*@ pure @*/ String name() {

    return m_Name;
  }

  /**
   * Tests if the attribute is a date type.
   *
   * @return true if the attribute is a date type
   */
  //@ ensures \result <==> (m_Type == DATE);
  public final /*@ pure @*/ boolean isDate() {

    return (m_Type == DATE);
  }

  private void setMetadata(ProtectedProperties metadata) {

    m_Metadata = metadata;

    if (m_Type == DATE) {
      m_Ordering = ORDERING_ORDERED;
      m_IsRegular = true;
      m_IsAveragable = false;
      m_HasZeropoint = false;
    } else {

      // get ordering
      String orderString = m_Metadata.getProperty("ordering","");

      // numeric ordered attributes are averagable and zeropoint by default
      String def;
      if (m_Type == NUMERIC
	  && orderString.compareTo("modulo") != 0
	  && orderString.compareTo("symbolic") != 0)
	def = "true";
      else def = "false";

      // determine boolean states
      m_IsAveragable =
	(m_Metadata.getProperty("averageable",def).compareTo("true") == 0);
      m_HasZeropoint =
	(m_Metadata.getProperty("zeropoint",def).compareTo("true") == 0);
      // averagable or zeropoint implies regular
      if (m_IsAveragable || m_HasZeropoint) def = "true";
      m_IsRegular =
	(m_Metadata.getProperty("regular",def).compareTo("true") == 0);

      // determine ordering
      if (orderString.compareTo("symbolic") == 0)
	m_Ordering = ORDERING_SYMBOLIC;
      else if (orderString.compareTo("ordered") == 0)
	m_Ordering = ORDERING_ORDERED;
      else if (orderString.compareTo("modulo") == 0)
	m_Ordering = ORDERING_MODULO;
      else {
	if (m_Type == NUMERIC || m_IsAveragable || m_HasZeropoint)
	  m_Ordering = ORDERING_ORDERED;
	else m_Ordering = ORDERING_SYMBOLIC;
      }
    }

    // consistency checks
    if (m_IsAveragable && !m_IsRegular)
      throw new IllegalArgumentException("An averagable attribute must be"
					 + " regular");
    if (m_HasZeropoint && !m_IsRegular)
      throw new IllegalArgumentException("A zeropoint attribute must be"
					 + " regular");
    if (m_IsRegular && m_Ordering == ORDERING_SYMBOLIC)
      throw new IllegalArgumentException("A symbolic attribute cannot be"
					 + " regular");
    if (m_IsAveragable && m_Ordering != ORDERING_ORDERED)
      throw new IllegalArgumentException("An averagable attribute must be"
					 + " ordered");
    if (m_HasZeropoint && m_Ordering != ORDERING_ORDERED)
      throw new IllegalArgumentException("A zeropoint attribute must be"
					 + " ordered");

    // determine weight
    m_Weight = 1.0;
    String weightString = m_Metadata.getProperty("weight");
    if (weightString != null) {
      try{
	m_Weight = Double.valueOf(weightString).doubleValue();
      } catch (NumberFormatException e) {
	// Check if value is really a number
	throw new IllegalArgumentException("Not a valid attribute weight: '"
					   + weightString + "'");
      }
    }

    // determine numeric range
    if (m_Type == NUMERIC) setNumericRange(m_Metadata.getProperty("range"));
  }
 /**
   * Produces a shallow copy of this attribute with a new name.
   *
   * @param newName the name of the new attribute
   * @return a copy of this attribute with the same index
   */
  //@ requires newName != null;
  //@ ensures \result.m_Name  == newName;
  //@ ensures \result.m_Index == m_Index;
  //@ ensures \result.m_Type  == m_Type;
  final /*@ pure non_null @*/ Attribute copy(String newName) {

    Attribute copy = new Attribute(newName);

    copy.m_Index = m_Index;
    copy.m_DateFormat = m_DateFormat;
    copy.m_Type = m_Type;
    copy.m_Values = m_Values;
    copy.m_Hashtable = m_Hashtable;
    copy.setMetadata(m_Metadata);

    return copy;
  }

  /**
   * Sets a value of a nominal attribute or string attribute.
   * Creates a fresh list of attribute values before it is set.
   *
   * @param index the value's index
   * @param string the value
   * @exception IllegalArgumentException if the attribute is not nominal or
   * string.
   */
  //@ requires string != null;
  //@ requires isNominal() || isString();
  //@ requires 0 <= index && index < m_Values.size();
  final void setValue(int index, String string) {

    switch (m_Type) {
    case NOMINAL:
    case STRING:
      m_Values = (FastVector)m_Values.copy();
      m_Hashtable = (Hashtable)m_Hashtable.clone();
      Object store = string;
      if (string.length() > STRING_COMPRESS_THRESHOLD) {
        try {
          store = new SerializedObject(string, true);
        } catch (Exception ex) {
          System.err.println("Couldn't compress string attribute value -"
                             + " storing uncompressed.");
        }
      }
      m_Hashtable.remove(m_Values.elementAt(index));
      m_Values.setElementAt(store, index);
      m_Hashtable.put(store, new Integer(index));
      break;
    default:
      throw new IllegalArgumentException("Can only set values for nominal"
                                         + " or string attributes!");
    }
  }

   /**
   * Tests if the attribute is numeric.
   *
   * @return true if the attribute is numeric
   */
  //@ ensures \result <==> ((m_Type == NUMERIC) || (m_Type == DATE));
  public final /*@ pure @*/ boolean isNumeric() {

    return ((m_Type == NUMERIC) || (m_Type == DATE));
  }


  /**
   * Sets the numeric range based on a string. If the string is null the range
   * will default to [-inf,+inf]. A square brace represents a closed interval, a
   * curved brace represents an open interval, and 'inf' represents infinity.
   * Examples of valid range strings: "[-inf,20)","(-13.5,-5.2)","(5,inf]"
   *
   * @param rangeString the string to parse as the attribute's numeric range
   * @exception IllegalArgumentException if the range is not valid
   */
  //@ requires rangeString != null;
  private void setNumericRange(String rangeString)
  {
    // set defaults
    m_LowerBound = Double.NEGATIVE_INFINITY;
    m_LowerBoundIsOpen = false;
    m_UpperBound = Double.POSITIVE_INFINITY;
    m_UpperBoundIsOpen = false;

    if (rangeString == null) return;

    // set up a tokenzier to parse the string
    StreamTokenizer tokenizer = new StreamTokenizer(new StringReader(rangeString));
    tokenizer.resetSyntax();
    tokenizer.whitespaceChars(0, ' ');
    tokenizer.wordChars(' '+1,'\u00FF');
    tokenizer.ordinaryChar('[');
    tokenizer.ordinaryChar('(');
    tokenizer.ordinaryChar(',');
    tokenizer.ordinaryChar(']');
    tokenizer.ordinaryChar(')');

    try {

      // get opening brace
      tokenizer.nextToken();

      if (tokenizer.ttype == '[') m_LowerBoundIsOpen = false;
      else if (tokenizer.ttype == '(') m_LowerBoundIsOpen = true;
      else throw new IllegalArgumentException("Expected opening brace on range,"
					      + " found: "
					      + tokenizer.toString());

      // get lower bound
      tokenizer.nextToken();
      if (tokenizer.ttype != tokenizer.TT_WORD)
	throw new IllegalArgumentException("Expected lower bound in range,"
					   + " found: "
					   + tokenizer.toString());
      if (tokenizer.sval.compareToIgnoreCase("-inf") == 0)
	m_LowerBound = Double.NEGATIVE_INFINITY;
      else if (tokenizer.sval.compareToIgnoreCase("+inf") == 0)
	m_LowerBound = Double.POSITIVE_INFINITY;
      else if (tokenizer.sval.compareToIgnoreCase("inf") == 0)
	m_LowerBound = Double.NEGATIVE_INFINITY;
      else try {
	m_LowerBound = Double.valueOf(tokenizer.sval).doubleValue();
      } catch (NumberFormatException e) {
	throw new IllegalArgumentException("Expected lower bound in range,"
					   + " found: '" + tokenizer.sval + "'");
      }

      // get separating comma
      if (tokenizer.nextToken() != ',')
	throw new IllegalArgumentException("Expected comma in range,"
					   + " found: "
					   + tokenizer.toString());

      // get upper bound
      tokenizer.nextToken();
      if (tokenizer.ttype != tokenizer.TT_WORD)
	throw new IllegalArgumentException("Expected upper bound in range,"
					   + " found: "
					   + tokenizer.toString());
      if (tokenizer.sval.compareToIgnoreCase("-inf") == 0)
	m_UpperBound = Double.NEGATIVE_INFINITY;
      else if (tokenizer.sval.compareToIgnoreCase("+inf") == 0)
	m_UpperBound = Double.POSITIVE_INFINITY;
      else if (tokenizer.sval.compareToIgnoreCase("inf") == 0)
	m_UpperBound = Double.POSITIVE_INFINITY;
      else try {
	m_UpperBound = Double.valueOf(tokenizer.sval).doubleValue();
      } catch (NumberFormatException e) {
	throw new IllegalArgumentException("Expected upper bound in range,"
					   + " found: '" + tokenizer.sval + "'");
      }

      // get closing brace
      tokenizer.nextToken();

      if (tokenizer.ttype == ']') m_UpperBoundIsOpen = false;
      else if (tokenizer.ttype == ')') m_UpperBoundIsOpen = true;
      else throw new IllegalArgumentException("Expected closing brace on range,"
					      + " found: "
					      + tokenizer.toString());

      // check for rubbish on end
      if (tokenizer.nextToken() != tokenizer.TT_EOF)
	throw new IllegalArgumentException("Expected end of range string,"
					   + " found: "
					   + tokenizer.toString());

    } catch (Exception e) {
      throw new IllegalArgumentException("IOException reading attribute range"
					 + " string: " + e.getMessage());
    }

    if (m_UpperBound < m_LowerBound)
      throw new IllegalArgumentException("Upper bound (" + m_UpperBound
					 + ") on numeric range is"
					 + " less than lower bound ("
					 + m_LowerBound + ")!");
  }


   /**
   * Produces a shallow copy of this attribute.
   *
   * @return a copy of this attribute with the same index
   */
  //@ also ensures \result instanceof Attribute;
  public /*@ pure non_null @*/ Object copy() {

    Attribute copy = new Attribute(m_Name);

    copy.m_Index = m_Index;
    copy.m_Type = m_Type;
    copy.m_Values = m_Values;
    copy.m_Hashtable = m_Hashtable;
    copy.m_DateFormat = m_DateFormat;
    copy.setMetadata(m_Metadata);

    return copy;
  }



  /**
   * Adds an attribute value.
   *
   * @param value the attribute value
   */
  //@ requires value != null;
  //@ ensures  m_Values.size() == \old(m_Values.size()) + 1;
  final void forceAddValue(String value) {

    Object store = value;
    if (value.length() > STRING_COMPRESS_THRESHOLD) {
      try {
        store = new SerializedObject(value, true);
      } catch (Exception ex) {
        System.err.println("Couldn't compress string attribute value -"
                           + " storing uncompressed.");
      }
    }
    m_Values.addElement(store);
    m_Hashtable.put(store, new Integer(m_Values.size() - 1));
  }
  

   //@ requires isDate();
  public /*@pure@*/ String formatDate(double date) {
    switch (m_Type) {
    case DATE:
      return m_DateFormat.format(new Date((long)date));
    default:
      throw new IllegalArgumentException("Can only format date values for date"
                                         + " attributes!");
    }
  }


}
