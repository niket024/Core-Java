package com;

public class Extract
{

	public static void main(String[] args)
	{
		String s1 = "welcome";
		String s2 = s1.substring(3);
		System.out.println(s2);
		String s4 = s1.substring(2, 5);
		System.out.println(s4);
		
		String s5 = "1,2,3,4,5,6,";
		System.out.println(s5.substring(0, s5.length()-1));
		
	}
}

//0 1 2 3 4 5 6
//w e l c o m e