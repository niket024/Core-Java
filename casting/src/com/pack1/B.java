package com.pack1;

public class B
{

	public static void main(String[] args)
	{
		short s = 10;
		int i = 89;
		i = s;
		s = (short) i;
		System.out.println(i);
		System.out.println(s);
		System.out.println("done");
	}
	
}
