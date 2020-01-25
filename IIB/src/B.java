public class B
{
	static
	{
		System.out.println("SIB");
	}

	B()
	{
		System.out.println("cons1");
	}

	B(int i)
	{
		System.out.println("cons2");
	}

	{
		System.out.println("thanks");
	}

	public static void main(String[] args)
	{
		B b1 = new B();
		B b2 = new B(90);
	}
}
