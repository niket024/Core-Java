package com.nik.problems;

import java.util.Scanner;

public class LookAndSayDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		String s = "1";
		System.out.println(s);

		while (n > 1) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < s.length(); ++i) {
				int count = 1;
				while ((i + 1) < s.length() && s.charAt(i) == s.charAt(i + 1)) {
					++count;
					++i;
				}
				sb.append(count).append(s.charAt(i));
			}
			--n;
			s = sb.toString();
			System.out.println(s);

		}

		sc.close();
	}

}
