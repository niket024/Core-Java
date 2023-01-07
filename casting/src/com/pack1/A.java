package com.pack1;

public class A
{
	static A a1;
	public static void main(String[] args)
	{
		int i = 90;
		double d = 1000.897777777;//90
//		d = i; //Auto widening
//		System.out.println(d);
		
		i = (int) d;
		System.out.println(i);
		
		System.out.println(a1);
		
		
		
	}
}
