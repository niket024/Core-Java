package vector;

import java.util.Vector;

public class A
{
	public static void main(String[] args)
	{
		Vector vector = new Vector();
		vector.add(123);
		vector.add("abd");
		vector.add(123.90);
		vector.add('c');
		vector.add(true);
		vector.add(23);
		vector.add(88888888l);
		vector.add(33.33f);
		System.out.println(vector);
	}
}
