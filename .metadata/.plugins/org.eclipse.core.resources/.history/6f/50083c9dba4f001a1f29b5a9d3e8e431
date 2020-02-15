package com.nik;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int arr[] = { 1, 3, 4, 5, 6, 7 };
		int length = arr.length;
		int half = arr.length / 2;
		for (int i = 0; i < half; i++) {
			int temp = arr[i];
			arr[i] = arr[length - (i + 1)];
			arr[length - (i + 1)] = temp;
		}
		System.out.println(Arrays.toString(arr));
		reverseArray(arr);
		otherWay(arr);
	}

	private static void otherWay(int[] arr) {
		int low = 0;
		int high = arr.length - 1;
		while (low < high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
		System.out.println(Arrays.toString(arr));


	}

	private static void reverseArray(int[] arr) {
		for (int i = 0, j = arr.length - 1; i <= j; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		System.out.println(Arrays.toString(arr));

	}
}
