public class C extends B
{
	C()
	{
		super(12);
		System.out.println("c-cons1");
	}

	public static void main(String[] args)
	{
		C c1 = new C();
		C c2 = new C();

	}
}
