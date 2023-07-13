import java.util.Scanner;

public class Factorial
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no");
		int n = sc.nextInt();//5
		int fact = 1;
		for (int i = n; i > 0; i--)
		{
			fact = fact * i;
		}
		System.out.println("factorial = " + fact);
		sc.close();
	}
}
