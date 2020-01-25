package com.nik;

import java.util.Scanner;

public class Factorial
{
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		String ch = "";
		do
		{
			System.out.println("Enter the number");
			int n = sc.nextInt();
			int fact = 1;
			if (n == 0)
			{
				System.out.println("factorial is " + fact);
				return;
			}
			for (int i = n; i > 0; i--)
			{
				fact = fact * i;
			}
			System.out.println("factorial is " + fact);
			System.out.println("Do you want to continue?(y/n)");
			ch = sc.next();
		} while (ch.equals("y"));
		System.out.println("Thanks");
		sc.close();
	}
}
