package com.nik;

import java.util.Scanner;

public class PermutationOfString
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		printPermutation("", sc.next());
		sc.close();
	}

	private static void printPermutation(String prefix, String str)
	{
		int len = str.length();
		if (len == 0)
		{
			System.out.println(prefix);
		} else
		{
			for (int i = 0; i < str.length(); i++)
			{
				printPermutation(prefix + str.charAt(i), str.substring(0, i)
						+ str.substring(i + 1, len));
			}
		}

	}
}
