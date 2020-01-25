import java.util.Scanner;

public class Even
{
	public static void main(String[] args)
	{
		int sume = 0, sumo = 0;
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the number");
		int a = s1.nextInt();
		for (int i = 1; i <= a; i++)
		{

			if (i % 2 == 0)
			{
				sume = sume + i;
			} else
				sumo = sumo + i;
		}
		System.out.println("sum of even number is:" + sume);
		System.out.println("sum of odd number is:" + sumo);
	}
}
