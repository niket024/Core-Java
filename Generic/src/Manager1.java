import java.util.ArrayList;

class D<A, B>
{
	A i, j;
	B m, n;
	String p, q;
}

public class Manager1
{
	public static void main(String[] args)
	{
		D<String, String> d1 = new D<String, String>();
		D<Integer, String> d2 = new D<Integer, String>();
		d1.i = "abc";
		d1.j = "abc";
		d1.m = "abc";
		d1.n = "abc";
		d1.p = "abc";
		d1.q = "abc";

		d2.i = 45;
		d2.j = 78;
		d2.m = "abc";
		d2.n = "abc";
		d2.p = "abc";
		d2.q = "abc";
		System.out.println("done");
	}
}
