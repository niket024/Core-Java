public class A
{
	A()
	{
		System.out.println("Cons1");
	}
	A(int i)
	{
		System.out.println("Cons2");
	}

	public static void main(String[] args)
	{
		A a1 = new A();
		A a2 = new A(12);
		System.out.println("main");
	}
}
