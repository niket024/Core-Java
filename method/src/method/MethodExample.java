package method;

public class MethodExample
{
	static void add()
	{
		int a = 10;
		int b = 20;
		int sum = a + b;
		System.out.println("Sum = " + sum);
	}

	static void sub(int a, int b)
	{
		int diff = a - b;
		System.out.println("Difference = " + diff);
	}

	static int mul()
	{
		int a = 10;
		int b = 20;
		int mul = a * b;
		return mul;
	}

	static int div(int a, int b)
	{
		return a / b;
	}

	public static void main(String[] args)
	{
		sub(20, 10);
		System.out.println("Mul = " + mul());
		System.out.println("Div = " + div(20, 5));
		System.out.println("Main");
	}
}
