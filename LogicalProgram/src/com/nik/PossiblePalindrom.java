package com.nik;

import java.util.Scanner;

public class PossiblePalindrom
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");

		findPalindrom(sc.nextLine());
		sc.close();
	}

	private static void findPalindrom(String str)
	{
		for (String s : str.split(" "))
		{
			StringBuffer sb = new StringBuffer();
			sb.append(s);
			if (s.equals(sb.reverse().toString()))
				System.out.println(s);
			else{
				System.out.println("not a palindrome");
			}
		}
	}
}
