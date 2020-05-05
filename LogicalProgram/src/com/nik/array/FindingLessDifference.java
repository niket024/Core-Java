package com.nik.array;

import java.util.ArrayList;
import java.util.List;

public class FindingLessDifference {
	public static void main(String[] args) {
		int arr[] = { 3, 6, 36, 32, 32, 121, 66, 24, 22, 371, 661, 6, 4, 8, -1 };
		System.out.println(processArray(arr));
	}

	private static int processArray(int[] arr) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<Integer> list1 = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if ((i + 1) < arr.length) {
				if (arr[i] >= arr[i + 1]) {
					list1.add(arr[i]);
				} else {
					list1.add(arr[i]);
					List<Integer> list2 = new ArrayList<Integer>(list1);
					list.add(list2);
					list1.clear();
				}
			}
		}
		System.out.println(list);
		List<Integer> list3 = list.get(0);
		for (List<Integer> l : list) {
			if (l.size() > list3.size()) {
				list3 = l;
			}
		}
		return list3.get(0) - list3.get(list3.size() - 1);
	}
}
