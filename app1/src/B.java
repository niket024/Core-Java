public class B
{
	static int test(int a)
	{
		return a;
	}
	void test1()
	{
		System.out.println("test");
	}

	public static void main(String[] args)
	{
	   B b1=new B();
	   b1=null;
	   b1.test1();
		int k = test(90);
	}
}
