package vector;

import java.util.Vector;

public class A
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
		System.out.println(v1);
	}
}
