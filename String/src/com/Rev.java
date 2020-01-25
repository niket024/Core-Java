package com;

import java.util.Scanner;

public class Rev
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1 = sc.next();
		String rev =null;
		if (!s1.isEmpty() && s1 != null)
		{
			 rev = getReverse(s1);
			System.out.println("Reverse = " + rev);
			checkPalindrome(s1,rev);
		} else
		{
			System.out.println("your string is empty");
		}
	}

	private static void checkPalindrome(String original, String reverse)
	{
		if(original.equals(reverse)){
			System.out.println("Palindrome");
		}else{
			System.out.println("not palindrome");
		}
		
	}

	private static String getReverse(String s1)
	{
		String rev = "";
		for (int i = s1.length() - 1; i >= 0; i--)
		{
			rev = rev + s1.charAt(i);
		}
		return rev;
	}
}
