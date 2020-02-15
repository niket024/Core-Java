package com.nik;

import java.util.Arrays;

/*
 * Given an array and a range [lowVal, highVal], 
 * partition the array around the range such that array is divided in three parts.
 1) All elements smaller than lowVal come first.
 2) All elements in range lowVal to highVVal come next.
 3) All elements greater than highVal appear in the end.
 	The individual elements of three sets can appear in any order.
 */
public class ArrayPartioningProblem {
	public static void main(String[] args) {
		int arr[] = { 1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32 };
		System.out.println("Before: " + Arrays.toString(arr));
		threeWayPartition(arr, 10, 20);
		System.out.println("After: " + Arrays.toString(arr));
	}

	private static void threeWayPartition(int[] arr, int low, int high) {
		int length = arr.length;
		int start = 0, end = length - 1;
		for (int i = 0; i < end;) {
			if (arr[i] < low) {
				int temp = arr[start];
				arr[start] = arr[i];
				arr[i] = temp;
				start++;
				i++;
			} else if (arr[i] > high) {
				int temp = arr[end];
				arr[end] = arr[i];
				arr[i] = temp;
				end--;
			} else {
				i++;
			}
		}

	}
}
