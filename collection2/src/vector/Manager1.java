package vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Manager1
{
public static void main(String[] args)
{
	Vector v1=new Vector();
	v1.add(12);
	v1.add("abc");
	v1.add(90);
	v1.add(12);
	v1.add(88);
	v1.add(67);
	System.out.println(v1);
//	Iterator i1=v1.iterator();
	Enumeration enum1=v1.elements();
	while(enum1.hasMoreElements())
	{
		System.out.println(enum1.nextElement()+",");
	}
	while(enum1.hasMoreElements())
	{
		System.out.print(enum1.nextElement()+",");
	}
}
}
