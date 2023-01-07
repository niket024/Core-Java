import java.util.Scanner;

public class Add
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the first data");
		
		int a = sc.nextInt();
		System.out.println("enter the second data");
		int b = sc.nextInt();
		int sum = a + b;
		System.out.println("your sum is:" + sum);
		
		System.out.println("enter your name");
		String name = sc.next();
		System.out.println("your name is: " + name);

	}

}
