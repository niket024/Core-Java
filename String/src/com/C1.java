package com;

public class C1
{
	public static void main(String[] args)
	{
		String s1 = "abc" + "xyz";
		
		String s2 = "abc" + s1;

		String s = s1.concat(s2);// s1+s2
////		
		String s3 = 2 + 4 + "abc";
		String s4 = "2" + "4" + "abc";
		String s5 = 2 + 4 + "abc" + 2;
		String s6 = 2 + 4 + "abc" + 2 + 4;
		String s7 = 2 + 4 + 2 + 4 +"";
		System.out.println(s7);

	}
}
