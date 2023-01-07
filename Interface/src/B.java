public class B implements C {

	@Override
	public void test1() {
		System.out.println("Test1");
		
	}
	@Override
	public void test2() {
		System.out.println("Test2");
		
	}

	
	public static void main(String[] args) {
		B b1 = new B();
		b1.test1();
		b1.test2();
	}
	

}