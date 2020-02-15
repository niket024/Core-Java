package com.nik.problems;

import java.util.Scanner;

public class CheckingPaternInString {
	public static void main(String[] args) {
		String arr[] = { "yes", "no", "maybe" };

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input");
		String s1 = sc.next();

		for (String s : arr) {
			s1 = s1.replaceAll(s, "");
		}
		if (s1.isEmpty() && s1.isBlank()) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		sc.close();
	}
}
