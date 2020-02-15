package com.nik.problems;

import java.util.Arrays;
import java.util.HashSet;

//Java  program to find triplets in a given 
//array whose sum is zero 
public class FindTriplets {
	public static void main(String[] args) {
		int arr[] = { 0, -1, 2, -3, 1 };
		int n = arr.length;
		System.out.println("Method1");
		method1(arr, n);
		System.out.println("Method2");

		method2(arr, n);
		System.out.println("Method3");

		method3(arr, n);
	}

//0(n^3)
	private static void method1(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						System.out.println(arr[i] + "" + arr[j] + " " + arr[k]);
					}
				}
			}
		}

	}

//O(n^2)
	private static void method2(int[] arr, int n) {
		boolean found = false;

		for (int i = 0; i < n - 1; i++) {
			// Find all pairs with sum equals to
			// "-arr[i]"
			HashSet<Integer> s = new HashSet<Integer>();
			for (int j = i + 1; j < n; j++) {
				int x = -(arr[i] + arr[j]);
				if (s.contains(x)) {
					System.out.printf("%d %d %d\n", x, arr[i], arr[j]);
					found = true;
				} else {
					s.add(arr[j]);
				}
			}
		}

		if (found == false) {
			System.out.printf(" No Triplet Found\n");
		}

	}

	private static void method3(int[] arr, int n) {
		{
			boolean found = false;

			// sort array elements
			Arrays.sort(arr);

			for (int i = 0; i < n - 1; i++) {
				// initialize left and right
				int l = i + 1;
				int r = n - 1;
				int x = arr[i];
				while (l < r) {
					if (x + arr[l] + arr[r] == 0) {
						// print elements if it's sum is zero
						System.out.print(x + " ");
						System.out.print(arr[l] + " ");
						System.out.println(arr[r] + " ");

						l++;
						r--;
						found = true;
					}

					// If sum of three elements is less
					// than zero then increment in left
					else if (x + arr[l] + arr[r] < 0)
						l++;

					// if sum is greater than zero than
					// decrement in right side
					else
						r--;
				}
			}

			if (found == false)
				System.out.println(" No Triplet Found");
		}

	}
}
