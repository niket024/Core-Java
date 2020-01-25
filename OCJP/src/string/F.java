package string;

import java.util.Scanner;

public class F
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the 1 number");
	int i=sc.nextInt();
	System.out.println("enter the 2 number");

	int j=sc.nextInt();
	System.out.println("before sorting");
	System.out.printf("i=%1$d,j=%2$d",i,j);
	System.out.println("\nAfter sorting\n");
	System.out.printf("i=%2$d,j=%1$d",i,j);
}
}
