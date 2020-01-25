public class A
{
	void test(int... i)
	{
		for(int j:i)
		{
			System.out.println(j);
		}
	}

	public static void main(String... args)
	{
		A a1 = new A();
		a1.test(23,67,78,78,90);
	}
}
