public class A
{
	void getSum()
	{
		int a = 10;
		int b = 20;
		int sum = a + b;
		System.out.println("sum = " + sum);
	}

	void getDiff(int a, int b)
	{
		int diff = a - b;
		System.out.println("Diff = " + diff);
	}

	int getMul()
	{
		int a = 10;
		int b = 20;
		int mul = a * b;
		return mul;
	}

	int getDiv(int a, int b)
	{
		int div = a / b;
		return div;
	}

	public static void main(String[] args)
	{
		A a1 = new A();
		a1.getSum();
		a1.getDiff(20, 10);
		int mul = a1.getMul();
		System.out.println("Mul = " + mul);
		int div = a1.getDiv(200, 5);
		System.out.println("Div = " + div);
		System.out.println("main");
	}
}
