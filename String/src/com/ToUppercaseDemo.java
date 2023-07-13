package com;

import java.util.Scanner;

public class ToUppercaseDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lower case word");
		String str = sc.next();
		String check ="@";
		System.out.println(str.toUpperCase());
		System.out.println(str.contains(check));
		System.out.println(str.replace('@', '#'));
	}
}
