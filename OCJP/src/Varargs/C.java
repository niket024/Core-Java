package Varargs;

public class C
{
	static void test(int... s1)
	{
		for(int s2:s1)
		{
			System.out.println("your no is:"+s2);
		}
	}
	static void test(byte b,int... s1)
	{
		System.out.println("byte");
	}
//	static void test(int... b,int s1)
//	{
//		System.out.println("byte");
//	}
	public static void main(String[] args)
	{
		byte b=10;
		test(12,34,5,6,6,7,7,8);
		test();
		System.out.println("----------");
		test(b,89,89,89,9);
	}
}
