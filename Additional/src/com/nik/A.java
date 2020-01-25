package com.nik;

import java.util.Scanner;

public class A
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s1 = sc.next();
		int count = 0;
		int len = s1.length();
		for (int j = 0; j < len; j++)

		{

			for (int i = 0; i <= 9; i++)

			{
				String s2 = Integer.toString(i);
				String s3=s1.charAt(j)+"";
				if (s2.equals(s3))
				{
					
					count++;
				}
			}
		}
		System.out.println("the no of digit is:" + count);
	}
}
