package com.nik;

import java.util.Arrays;

public class SortingBinaryIntegerArray {
	public static void main(String[] args) {
		int a[] = { 1, 1, 0, 0, 0, 1, 0, 1 };
		first(a);
		System.out.println(Arrays.toString(a));
		int b[] = { 1, 1, 0, 0, 0, 1, 0, 1 };
		second(b);
		System.out.println(Arrays.toString(b));

	}

	private static void second(int[] a) {
		int i = 0;
		int j = a.length - 1;
		while (i < j) {
			while (a[i] == 0 && i < j)
				i++;
			while (a[j] == 1 && i < j)
				j--;
			if (i < j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				j--;
				i++;
			}

		}

		return;
	}

	private static void first(int[] a) {
		int k = 0;

		// do for each element
		for (int i = 0; i < a.length; i++) {
			// if current element is zero, put 0 at next free
			// position in the array
			if (a[i] == 0) {
				a[k++] = 0;
			}
		}

		// fill all remaining indices by 1
		for (int i = k; i < a.length; i++) {
			a[k++] = 1;
		}
	}
}
