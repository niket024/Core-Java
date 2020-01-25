import java.util.Scanner;

public class C
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String choice = "";
		do{
			System.out.println("Enter the number");
			int n = sc.nextInt();
			int fact = 1;
			if (n == 0)
			{
				System.out.println("Factorial = " + fact);
			} else if (n < 0)
			{
				System.out.println("Invalid input");
			} else
			{
	
				for (int i = n; i >= 1; i--)
				{
					fact = fact*i;
				}
				System.out.println("Factorial = " + fact);
				
			}
			System.out.println("Do you want to continue?(y/n)");
			choice = sc.next();
		}while(choice.equalsIgnoreCase("y"));
		System.out.println("Thanks!!!");
		sc.close();
	}
}
