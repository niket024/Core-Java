package Varargs;

public class B
{
	static void test(String... s1)
	{
		for(String s2:s1)
		{
			System.out.println("your msg is:"+s2);
		}
	}
	public static void main(String[] args)
	{
		test("msg1");
		System.out.println("-------");
		test("msg1","msg2");
		System.out.println("-------");
		test("msg1","msg2","msg3");
		System.out.println("----------");
		test("msg1","msg2","msg3","msg4");
		
	}
}
