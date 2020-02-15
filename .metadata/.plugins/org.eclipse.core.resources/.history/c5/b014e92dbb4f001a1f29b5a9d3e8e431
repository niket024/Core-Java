package com.nik;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st string");
		String s1 = sc.next();
		System.out.println("Enter 2nd string");
		String s2 = sc.next();

		System.out.println(isAnagram(s1, s2));
		sc.close();
	}

	private static boolean isAnagram(String s1, String s2)
	{
		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		return Arrays.equals(a, b);
	}
}
