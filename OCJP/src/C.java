public class C
{
	static int test()
	{
		System.out.println("test");
		return 90;
	}

	static long test1(int i)
	{
		System.out.println("test1");
		return 78888888888888l;

	}

	public static void main(String[] args)
	{
		long i = test();
		System.out.println(test1(89));
		System.out.println("main");

	}
}
