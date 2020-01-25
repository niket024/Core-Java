import java.util.Scanner;

public class Fact
{
	public static void main(String[] args)
	{
		int sume = 0;
		int sumo = 0;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		n = sc.nextInt();

		for (int i = 1; i < n; i++)
		{
			if (i % 2 == 0)
			{

				sume = sume + i;
			} else
			{

				sumo = sumo + i;
			}

		}
		System.out.println("sum of even numbers=" + sume);
		System.out.println("sum of odd numbers=" + sumo);
	}
}