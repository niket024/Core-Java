public class C {

	static int i = 10;
	int j = 20;
	
	static void printSum()
	{
		int num1 = 10;
		int num2 = 20;
		int sum = num1 + num2;
		System.out.println("Sum=" + sum);
	}

	void printSub()
	{
		int num1 = 30;
		int num2 = 20;
		int diff = num1 - num2;
		System.out.println("Diff=" + diff);
	}
	public static void main(String[] args) {
		System.out.println(C.i);
		C c1 = new C();
		System.out.println(c1.j);
		C.printSum();
		c1.printSub();

	}

}
