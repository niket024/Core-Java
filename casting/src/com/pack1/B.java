package com.pack1;

public class B
{
	static B b1;
	public static void main(String[] args)
	{
		System.out.println(b1);
		short s = 10;
		int i = 89;
		i = s;
		s = (short) i;
		System.out.println(i);
		System.out.println(s);
		System.out.println("done");
	}
	static int test()
	{
		System.out.println("Test");
		return (int)90l;
	}
}
