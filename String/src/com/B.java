package com;

public class B
{

	public static void main(String[] args)
	{
		String s1 = new String("abc");
		String s2 = "abc";
		String s3 = new String("abc");
		String s4 = "abc";
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s2 == s4);
	}
}
