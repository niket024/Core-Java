package pack1;

public class A
{
	static int i = test();

	static int test()
	{
		main(null);
		return 20;
	}

	public static void main(String[] args)
	{
		System.out.println("main:" + i);
	}
}
