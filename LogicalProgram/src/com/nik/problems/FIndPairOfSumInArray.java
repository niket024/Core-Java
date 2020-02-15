package com.nik.problems;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class FIndPairOfSumInArray {
	public static void main(String[] args) {
		int arr[] = { 23, 1, 4, 6, 10, 5, 7, 15 };
		int sum = 16;
		printPair(arr, sum);
		method2(arr, sum);
		method3(arr, sum);
		System.out.println("done");
	}

	private static void method3(int[] arr, int sum) {
		Arrays.sort(arr);
		int low = 0;
		int high = arr.length - 1;
		while (low < high) {
			if (arr[low] + arr[high] == 16) {
				System.out.println(arr[low] + " and " + arr[high]);
			}
			if ((arr[low] + arr[high]) > sum) {
				high--;
			} else {
				low++;
			}
		}

	}

	private static void printPair(int[] arr, int sum) {
		Set<Integer> pairs = new LinkedHashSet<>();
		for (int i = 0; i < arr.length; i++) {
			int temp = sum - arr[i];
			if (pairs.contains(temp)) {
				System.out.println(temp + " and " + arr[i]);
			}
			pairs.add(arr[i]);
		}

	}

	private static void method2(int[] arr, int sum) {
		Set<Integer> pairs = new LinkedHashSet<>();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == sum) {
					pairs.add(arr[i]);
					pairs.add(arr[j]);

				}
			}
		}
		System.out.println(pairs);

	}
}
