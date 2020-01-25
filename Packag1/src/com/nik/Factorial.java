package com.nik;

import java.util.Scanner;

public class Factorial
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numer");
		int no = sc.nextInt();
		int fact = 1;
		if (no == 0)
		{
			System.out.println("Factorial is = " + fact);
		} else
		{
			for (int i = no; i > 0; i--)
			{
				fact = fact * i;
			}
			System.out.println("Factorial is = " + fact);
		}
		sc.close();

	}
}
