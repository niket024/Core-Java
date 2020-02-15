package com.nik;

import java.util.Scanner;

public class ReverseIntegerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		method1(n);
		System.out.println();
		method2(n);
		sc.close();
	}

	private static void method2(int n) {
		int reverse = 0;
		while (n > 0) {
			int k = n % 10;
			reverse = reverse * 10 + k;
			n = n / 10;
		}
		System.out.println(reverse);

	}

	private static void method1(int n) {
		while (n > 0) {
			System.out.print(n % 10);
			n = n / 10;
		}
	}
}
