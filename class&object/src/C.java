public class C
{

	
	public static void main(String[] args)
	{
		C.test();
		System.out.println("main");
		C.test();
		C c1 = new C();
		c1.test1();
	}
	
	static void test()
	{
		System.out.println("Test");
		System.out.println("Test");
		System.out.println("Test");
		System.out.println("Test");
		System.out.println("Test");
		System.out.println("Test");
		System.out.println("Test");
	}
	
	void test1()
	{
		System.out.println("test1");
	}
}
