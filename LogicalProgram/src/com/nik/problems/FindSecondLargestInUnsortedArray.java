package com.nik.problems;

public class FindSecondLargestInUnsortedArray {
	public static void main(String[] args) {
		int arr[] = { 1, 3, 4, 5, 6, 2, 3, 40, 10, 22, 34, 78, 56 };
		int max = arr[0];
		int secondMax = arr[0];

		for (int i : arr) {
			if (i > max) {
				secondMax = max;
				max = i;
			} else if (i > secondMax) {
				secondMax = i;
			}

		}

		System.out.println("Maximum no. is " + max);
		System.out.println("Second Maximum no. is " + secondMax);
	}
}
