package com.nik;

import java.util.Scanner;

public class A
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the a value");
		int a=sc.nextInt();
		System.out.println("enter the b value");
		int b=sc.nextInt();
		int sum=a+b;
		System.out.println("enter your name");
		String name=sc.next();
		System.out.println("your name is:"+name);
		System.out.println("sum="+sum);
	}
}
