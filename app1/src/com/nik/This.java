package com.nik;

public class This
{
	int i;

	void test(int i)
	{
		this.i = i;
		System.out.println(i);
	}
	public static void main(String[] args)
	{
		This t1=new This();
		t1.test(45);
		System.out.println(t1.i);
	}
}
