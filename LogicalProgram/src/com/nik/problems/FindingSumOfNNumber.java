package com.nik.problems;

public class FindingSumOfNNumber {

	public static void main(String[] args) {
		System.out.println(sum(5));
	}

	private static int sum(int n) {
		if (n == 0) {
			return 0;
		} else {
			return n + sum(--n);

		}
	}

}
