package com.nik;

import java.util.Scanner;

public class B
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the string");
	String s1 = sc.next();
	int count=0;
	char []c=s1.toCharArray();
	int k;
	for(int i=0;i<s1.length();i++)
	{
		 k=c[i]	;
		 if((k>=48)&&(k<=57))
		 {

			 count++;
		 }
	}
	System.out.println("the no of didgit is:"+count);
	
}
}
