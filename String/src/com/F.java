package com;

public class F
{
	public static void main(String[] args)
	{

		String s1 = "welcome";

		// welcome
		System.out.println(s1.charAt(3));
		System.out.println(s1.indexOf('m'));
		System.out.println(s1.lastIndexOf('m'));
		System.out.println(s1.length());
		String s2 = s1.trim();
		System.out.println(s2.length());
		System.out.println(s1.length());
		System.out.println(s1.contains("come"));
		System.out.println(s1.endsWith("me"));
		System.out.println(s1.isEmpty());
		System.out.println(s1.toCharArray());
		
	}
}

// 0 1 2 3 4 5 6
// w e l c o m e