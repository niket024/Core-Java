package com;

import java.util.HashSet;
import java.util.Set;

public class FindSum {
	public static void main(String[] args) {
		int a[] = { 2, 7, 8, 3, 5, 1 };
		int sum = 10;
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (i != j) {
					if ((a[i] + a[j]) == 10) {
						System.out.println(a[i] + "," + a[j]);
					}
				}
			}
		}
		Set<Integer> set = new HashSet<Integer>();
		System.out.print("[");
		for (int i = 0; i < a.length; i++) {
			int temp = sum - a[i];
			if (set.contains(temp)) {
				System.out.print("(" + temp + " , " + a[i] + "),");
			}
			set.add(a[i]);
		}
		System.out.println("]");
	}
}
