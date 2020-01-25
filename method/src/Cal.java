import java.util.Scanner;

public class Cal
{
	void add()
	{
		int a = 10;
		int b = 20;
		int sum = a + b;
		System.out.println("sum = " + sum);
	}

	void sub(int a, int b)
	{
		int sub = a - b;
		System.out.println("sub = " + sub);
	}

	int mul()
	{
		int a = 10;
		int b = 20;
		int mul = a * b;
		return mul;
	}

	int div(int a, int b)
	{
		int div = a / b;
		return div;
	}

	public static void main(String[] args)
	{
		Cal c1 = new Cal();
		System.out.println("****CALCULATOR*****");
		c1.add();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the a value");
		int a = sc.nextInt();
		System.out.println("enter the b value");
		int b = sc.nextInt();
		c1.sub(a, b);
		// int mul = c1.mul();
		System.out.println("mul = " + c1.mul());
		System.out.println("enter the dividend");
		int x = sc.nextInt();
		System.out.println("enter the divide");
		int y = sc.nextInt();
		int div = c1.div(x, y);
		System.out.println("div = " + div);

	}
}
