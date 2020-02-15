package com.nik.problems;

import java.util.Scanner;

public class DecimalToBinary
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no.");
		int n = scanner.nextInt();
		System.out.println("Decinal No:" + n);
		convertBinary(n);
		String binary = "";
		while (n > 0)
		{
			int a = n % 2;
			binary = binary + " " + a;
			n = n / 2;
		}
		System.out.print("\nBinary No:" + new StringBuffer(binary).reverse());
		scanner.close();
	}

	public static void convertBinary(int num)
	{
		int binary[] = new int[40];
		int index = 0;
		while (num > 0)
		{
			binary[index++] = num % 2;
			num = num / 2;
		}
		for (int i = index - 1; i >= 0; i--)
		{
			System.out.print(binary[i]);
		}
	}
}
