import java.util.Scanner;

public class Reverse
{
	public static void main(String[] args)
	{
		String ch = "";
		do
		{
			String s = "";
			Scanner sc = new Scanner(System.in);
			System.out.println("enter your string");
			String s1 = sc.next();
			int len = s1.length();
			for (int i = len - 1; i >= 0; i--)
			{
				s = s + s1.charAt(i);
			}
			if (s1.equals(s))
			{
				System.out.println("palidrome");

			} else
			{
				System.out.println("not palidrome");
			}
			System.out.println("do u want again?(y/n)");
			ch = sc.next();
		} while ("y".equals(ch));
		System.out.println("thank you!");
	}
}
