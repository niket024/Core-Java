package com;

public class Rev1 {

	public static void main(String[] args) {
		String input = "welcome";
		String rev = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			rev = rev + input.charAt(i);
		}
		System.out.println(rev);

		if (input.equals(rev)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not palindrome");
		}

	}
}
