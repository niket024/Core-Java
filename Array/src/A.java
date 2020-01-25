import java.util.Scanner;

public class A
{
	public static void main(String[] args)
	{
		int marks[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < marks.length; i++)
		{
			System.out.println("Enter the marks " + (i + 1));
			marks[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < marks.length; i++)
		{
			sum = sum + marks[i];
		}
		int avg = sum / marks.length;
		if (avg > 60)
		{
			System.out.println("You are pass");
		} else
		{
			System.out.println("You are fail");
		}
		sc.close();

	}
}
