package pack1;

public class C
{
	static int i = test1();

	static int test1()
	{
		System.out.println(1);
		test2();
		System.out.println(2);
		return 10;
	}

	static void test2()
	{
		System.out.println(3);
		main(null);
		System.out.println(4);

	}

	static
	{
		System.out.println(5 + ":" + i);
		i = 20;
		main(null);
		System.out.println(6 + ":" + i);

	}

	public static void main(String[] args)
	{
		System.out.println(7 + ":" + i);
		i = 30;

	}
}
