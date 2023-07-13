public class C extends B {
	C() 
	{
		this(12);
		System.out.println("c-cons1");
	}

	C(int i) {
		
		System.out.println("c-cons2");
	}

	public static void main(String[] args) {
		C c1 = new C();

		System.out.println("main");
	}
}
