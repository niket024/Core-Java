package string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class J
{
	public static void main(String[] args)
	{
		int count = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String src = sc.next();
		for (int i = 0; i <= 9; i++)
		{
			Pattern p1 = Pattern.compile(Integer.toString(i));
			Matcher m1 = p1.matcher(src);
			while (m1.find())
			{

				count++;
			}
		}
		System.out.println("The no of digit is:" + count);

	}
}
