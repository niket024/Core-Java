public class A {

	void test() {
		System.out.println("test without args");
	}

	void test(int i) {
		System.out.println(i);
		System.out.println("test with one args");
	}

	void test(double i) {
		System.out.println(i);
		System.out.println("test with one double args");
	}

	void test(int i, int j) {
		System.out.println("test with two args");
	}

	public static void main() {
		System.out.println("Main");
	}

	public static void main(String[] args) {
		A a1 = new A();
		a1.test();
		a1.test(12);
		a1.test(12.4);
		a1.test(12, 4);
		main();

	}
}
