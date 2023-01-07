public class Manager
{
	static void method(A a2)
	{
		System.out.println(a2.i);
		a2.test();
	}
	

	public static void main(String[] args)
	{
		A a1 = new A();
		method(a1);
		
		B b1 = new B();
		method(b1);
		
		C c1 = new C();
		method(c1);

		

	}
}
