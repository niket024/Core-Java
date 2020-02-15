package com.nik.problems;

import java.util.Scanner;

/*
 * Draw a staircase of height N in the format given below
 #
 ##
 ###
 ####
 #####
 ######
 */
public class HeightOfStairCase
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no");
		int n = sc.nextInt();
		drawStairCase(n);
		System.out.println("another way");
		anotherWay(n);
		sc.close();
	}

	private static void anotherWay(int n)
	{
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= n; j++)

			{
				if ((i + j) > n)
				{
					System.out.print("#");
				} else
				{
					System.out.print(" ");
				}

			}
			System.out.println();

		}
	}

	private static void drawStairCase(int n)
	{
		for (int i = 1; i <= n; i++)
		{
			for (int j = i; j <= n; j++)
			{
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++)
			{
				System.out.print("#");
			}
			System.out.println();
		}

	}

}
