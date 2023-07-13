public class A {
	void test() {
		System.out.println("test-A");
	}
	void test(int i)
	{
		System.out.println("Test1");
	}
	void test(int i, int j)
	{
		System.out.println("Test4");
	}
	void test(double i)
	{
		System.out.println("Test2");
	}

	public static void main(String[] args) {
		A a1 = new A();
		a1.test();
		a1.test(12);
		a1.test(12.78);
		a1.test(12,78);
		

	}

}
