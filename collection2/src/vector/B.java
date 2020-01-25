package vector;

import java.util.Vector;

public class B
{
public static void main(String[] args)
{
	Vector v1=new Vector();
	v1.add(100);
	v1.add("abc");
	v1.add(150.0);
	v1.add(100);
	v1.add("abc");
	v1.add("abc");
	v1.add("abc");
	v1.add("abc");
	v1.add("abc");
	v1.add("abc");
	v1.add("abc");
	

	System.out.println(v1.size());
	System.out.println(v1.capacity());
}
}
