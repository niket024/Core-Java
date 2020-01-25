package ocjp.clone;

public class C implements Cloneable
{
	int i;
	double d;
	String s1;
	Integer i1;

	C(int i, double d, String s1, Integer i1)
	{
		this.i = i;
		this.d = d;
		this.s1 = s1;
		this.i1 = i1;
	}

	@Override
	public String toString()
	{

		return "i=" + i + ",d=" + d + ",s1=" + s1 + ",i1=" + i1;
	}

	public static void main(String[] args) throws CloneNotSupportedException
	{
		C c1 = new C(23, 34.56, "abc", 45);
		System.out.println(c1);
		C c2 = (C) c1.clone();
		System.out.println(c2);
		c2.i = 20;
		c2.d = 90.89;
		c2.s1 = "xyz";
		c2.i1 = 34;
		System.out.println("---------");
		System.out.println(c1);
		System.out.println(c2);
		// //here also deep copy
	}
}
