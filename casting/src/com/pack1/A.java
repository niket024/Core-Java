package com.pack1;

public class A
{
	public static void main(String[] args)
	{
		int i = 90;
		double d = 1000.897777777;
		//d = i;// auto widening
		i =  (int) d;// explicit narrowing
		System.out.println(i);
		System.out.println(d);

	}
}
