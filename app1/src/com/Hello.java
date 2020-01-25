package com;

import java.util.Scanner;

public class Hello
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int sum_e = 0;
		int sum_o = 0;

		for (int i = 1; i <= n; i++)
		{
			if (i % 2 == 0)
			{
				sum_e = sum_e + i;

			} else
			{
				sum_o = sum_o + i;

			}
		}
		System.out.println("sum of even no is:" + sum_e);
		System.out.println("sum of odd no is:" + sum_o);
	}
}