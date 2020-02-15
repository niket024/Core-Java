package com.nik;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * Build the possible palindrome for given string
 */
public class BuildPalindrom
{
	static List<String> list = new ArrayList<String>();

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		buildPalindrom("", sc.next());
		sc.close();
		System.out.println("****************Plindrom***************");
		printPalindrom(list);
	}

	private static void buildPalindrom(String prefix, String str)
	{

		int n = str.length();
		if (n == 0)
		{
			list.add(prefix);
			System.out.println(prefix);
		} else
		{
			for (int i = 0; i < n; i++)
				buildPalindrom(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
		}

	}

	private static void printPalindrom(List<String> list)
	{
		for (String s : list)
		{
			StringBuffer sb = new StringBuffer();
			sb.append(s);
			if (s.equals(sb.reverse().toString()))
				System.out.println(s);
		}

	}
}
