public class A
{
	static void test()
	{
		//browse
		for (int i = 0; i < 2000; i++)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args)
	{
		test();
		
		System.out.println("------------------");
		//notification
		for (int i = 2000; i < 4000; i++)
		{
			System.out.println(i);
		}
	}
}
