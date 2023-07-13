public class A1 extends A
{

	@Override
	public void test(int i) {
		System.out.println("test");

	}

	@Override
	void test1() {
		System.out.println("test1");
		
	}
	
	
	
	public static void main(String[] args) {
		A1 a1 = new A1();
		a1.test(123);
		a1.test1();
		a1.test2();
	}

	
	
}
