package com;

import java.util.Scanner;

public class ReverseDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word which you want to reverse");
		String input = sc.next();
		System.out.println("before trim = " + input.length());
		input = input.trim();
		System.out.println("After trim = " + input.length());

		if (input.isEmpty()) {
			System.out.println("The given input is empty");
		} else {
			String rev = "";
			// welcome -6
			for (int i = input.length() - 1; i >= 0; i--) {
				rev = rev + input.charAt(i);
			}
			System.out.println(rev);

			if (input.equals(rev)) {
				System.out.println("The given word is palindrome");
			} else {
				System.out.println("The given word is not palindrome");
			}
		}
		sc.close();
	}
}
