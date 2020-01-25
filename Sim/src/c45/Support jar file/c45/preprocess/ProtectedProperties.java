/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package c45.preprocess;

import java.util.Enumeration;
import java.util.Properties;

/**
 *
 * @author brindha
 */
public class ProtectedProperties extends Properties {
 // the properties need to be open during construction of the object
  private boolean closed = false;

  /**
   * Creates a set of protected properties from a set of normal ones.
   *
   * @param props the properties to be stored and protected.
   */
  public ProtectedProperties(Properties props)
  {

    Enumeration propEnum = props.propertyNames();
    while (propEnum.hasMoreElements()) {
      String propName = (String) propEnum.nextElement();
      String propValue = props.getProperty(propName);
      super.setProperty(propName, propValue);
    }
    closed = true; // no modifications allowed from now on
  }
}
