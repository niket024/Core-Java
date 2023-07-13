public class Manager
{
	static void method(A a) //a=b1
	{
		System.out.println(a.i);
		a.test();
	}
	

	public static void main(String[] args)
	{
		A a1 = new A();
		//method(a1);
		
		B b1 = new B();
		//method(b1);
		System.out.println(b1.i);
//		
		C c1 = new C();
		method(c1);
		System.out.println(c1.i);

		

	}
}
