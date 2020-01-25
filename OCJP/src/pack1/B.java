package pack1;

public class B
{
	static int i = test();

	static int test()
	{
		String s1[]={"abc","xyz"};
		main(s1);
		return 20;
	}

	public static void main(String[] args)
	{
		System.out.println("main:" + i);
	}
}
 