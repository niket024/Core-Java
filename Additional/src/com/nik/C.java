package com.nik;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C
{

	public static void main(String args[])
	{
		int count = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s1 = sc.next();
		for(int i=0;i<s1.length();i++)
		{
		
		if(s1.matches(".*\\d+.*"))
		{
			count++;
		}
		}
		System.out.println(count);
	}
}
