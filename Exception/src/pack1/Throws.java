package pack1;

public class Throws {
	static void test() throws ArithmeticException
	{
		System.out.println("test");
		int i = 10/0;
	}
	
	public static void main(String[] args) {
		test();
		System.out.println("main");
	}
}
