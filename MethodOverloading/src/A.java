public class A
{
	void test()
	{
		System.out.println("test");
	}
	
	void test(int i)
	{
		System.out.println("test with parameter integer");
	}

	void test(int i, int j)
	{
		System.out.println("test with parameter 2 integer ");
	}

	void test(double i)
	{
		System.out.println("test with parameter double");
	}

	public static void main(String[] args)
	{
		Account customer = new Account();
		A a1 = new A();
		a1.test();
		a1.test(12);
		a1.test(78.78);
		a1.test(12, 34);
	}
}
