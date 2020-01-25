public class B extends A
{
	B()
	{
		super();
		System.out.println("b-cons1");
	}

	public static void main(String[] args)
	{
		B b1 = new B();

		System.out.println("main");
	}

}
