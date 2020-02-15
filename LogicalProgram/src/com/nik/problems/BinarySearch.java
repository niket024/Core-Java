package com.nik.problems;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.stream.IntStream;

public class BinarySearch {
	public static void main(String[] args) {
		int arr[] = IntStream.range(0, 10000).toArray();
		System.out.println(Arrays.toString(arr));
		Instant start1 = Instant.now();
		binarySearch(arr, 0, arr.length, 4);
		Instant end1 = Instant.now();
		System.out.println("Time taken in iterative approach : " + Duration.between(end1, start1).toMillis());

		Instant start2 = Instant.now();
		System.out.println(binarySearchRecursiveWay(arr, 0, arr.length, 4));
		Instant end2 = Instant.now();
		System.out.println(
				"Time taken in recursive binary search approach : " + Duration.between(end2, start2).toMillis());
		Instant start3 = Instant.now();
		linearSearch(arr, 9999999);
		Instant end3 = Instant.now();
		System.out.println("Time taken in linear search: " + Duration.between(end3, start3).toMillis());
	}

	private static void linearSearch(int[] arr, int key) {
		for (int i : arr) {
			if (i == key) {
				System.out.println(i);
				break;
			}
		}

	}

	private static int binarySearchRecursiveWay(int[] arr, int start, int end, int key) {
		if (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == key) {
				return arr[mid];
			} else if (arr[mid] > key) {
				return binarySearchRecursiveWay(arr, start, mid - 1, key);
			} else {
				return binarySearchRecursiveWay(arr, mid + 1, end, key);

			}
		}
		return -1;

	}

	private static void binarySearch(int arr[], int start, int end, int key) {

		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == key) {
				System.out.println(arr[mid]);
				break;
			} else if (arr[mid] < key) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}

	}
}
