abstract class A
{
	abstract public void test(int i);
	abstract public void test2(int i);
	void test1() {
		System.out.println("Test1");
	}

	public static void main(String[] args) {
		A a1 = new A();
	}
}