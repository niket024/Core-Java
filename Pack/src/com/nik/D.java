package com.nik;

import java.util.Scanner;

public class D
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int n1 = sc.nextInt();
		System.out.println("Enter the second number");
		int n2 = sc.nextInt();
		int sum = n1+ n2;
		System.out.println("Sum = "+ sum);
		System.out.println("Whats your name?");
		
		String name = sc.next();
		System.out.println("Your name is " + name);
	}
}
