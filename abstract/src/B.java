public class B extends C {

	@Override
	public void test(int i) {
		System.out.println("test");
		
	}

	@Override
	public void test2(int i) {
		System.out.println("test2");
		
	}
	
	@Override
	void test4() {
		System.out.println("Test4");
	}
	
	public static void main(String[] args) {
		B b1 = new B();
		b1.test(0);
		b1.test2(0);
		b1.test1();
		b1.test4();
	}

}