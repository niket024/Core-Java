package com.nik.problems;

/*
 * JAVA Code to Find a pair with maximum 
 product in array of Integers 
 */
public class FIndMaxProduct {
	public static void main(String[] args) {
		int arr[] = { 1, 4, 3, 6, 7, 9 };
		int n = arr.length;
		maxProduct(arr, n);
	}

	private static void maxProduct(int[] arr, int n) {
		if (n < 2) {
			System.out.println("no pair found");
			return;
		}
		int a = arr[0];
		int b = arr[1];
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] * arr[j] > a * b) {
					a = arr[i];
					b = arr[j];
				}
			}
		}
		System.out.println("Max product =" + a * b);

	}
}
