import java.util.Scanner;

public class Hello
{
	public static void main(String[] args)
	{
		int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the no:");
		int n=sc.nextInt();
		if(n==0)
		{
			System.out.println("facorial="+fact);
		}
		else
		{
			for (int i = n; i >0; i--)
			{
				fact=fact*i;
			}
			System.out.println("facorial="+fact);

		}
	}
}
