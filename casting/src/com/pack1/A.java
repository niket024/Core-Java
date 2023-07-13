package com.pack1;

public class A
{
	static A a1;
	int i;
	public static void main(String[] args)
	{
		
		int i = 90;
		double d = 1000.897777777; //autowidening
		d = i;
		long l = i;
		System.out.println(d);
		System.out.println(l);
		System.out.println(a1.i);
		
	}
}
