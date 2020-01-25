package vector;

import java.util.Enumeration;
import java.util.Vector;

public class A1
{
	public static void main(String[] args)
	{
		Vector v1 = new Vector();
		v1.add(123);
		v1.add("abd");
		v1.add(123.90);
		v1.add('c');
		v1.add(true);
		v1.add(23);

		v1.add(88888888);
		v1.add(3333);
		Enumeration en = v1.elements();
		while (en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
	}
}
