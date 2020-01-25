public class B extends A
{
	
	 public void test()
	{
		super.test();
		System.out.println("test-b");
	}

	public static void main(String[] args)// signature
	{
		B b1 = new B();
		b1.test();

	}
	
}
