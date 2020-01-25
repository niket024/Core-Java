public class D implements Cloneable
{
	void test()
	{
		System.out.println("test");
	}

	public static void main(String[] args)
	{

		D d1 = new D();
		try
		{
			D d2 = (D) d1.clone();
			System.out.println(d1 == d2);
			System.out.println(d1.equals(d2));
			d2.test();
		}
		catch (CloneNotSupportedException ex)
		{

		}
		System.out.println("done");
	}
}
