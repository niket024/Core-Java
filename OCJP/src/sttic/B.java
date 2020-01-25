package sttic;

public class B {
	static int i = test();

	static int test() {
		System.out.println(i);
		System.out.println("from test");
		return 10;
	}

	public static void main(String[] args) {
		System.out.println("main1");
		System.out.println(i);
		System.out.println("main2");

	}
}
