public class B
{
	static int i;

	static
	{
		System.out.println("SIB");
		i = 20;
	}

	B()
	{
		System.out.println("cons");
	}
	
	{
		System.out.println("IIB");
	}

	public static void main(String[] args)
	{
		B b = new B();
		B b1 = new B();
		System.out.println("main");
		System.out.println(i);
	}

}
