package com;

import java.util.Scanner;

public class Rev1
{
	static String rev = "";

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string ");
		String s1 = sc.next();
		for (int i = s1.length() - 1; i >= 0; i--)
		{
			rev = rev + s1.charAt(i);
		}
		System.out.println("reverse=" + rev);
		sc.close();
	}
}
