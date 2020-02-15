package com.nik.problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElement {
	public static void main(String[] args) {

		// Initialize array
		int[] arr = { 1, 2, 3, 4, 2, 7, 8, 8, 3, 2, 7, 3, 8 };
		System.out.println("Duplicate elements in given array: ");
		// Searches for duplicate element
		firstWay(arr);
		System.out.println("------------------");
		secondWay(arr);
		System.out.println("------------------");
		thirdWay(arr);
		System.out.println("------------------");
		findWithJava8(arr);
	}

	private static void secondWay(int[] arr) {
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		Set<Integer> set = new HashSet<Integer>();
		for(Integer i: list) {
			if(Collections.frequency(list, i) >1)
				set.add(i);
		}
		System.out.println(set);
	}

	private static void firstWay(int[] arr) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					set.add(arr[j]);
			}
		}
		System.out.println(set);
	}

	private static void findWithJava8(int[] arr) {
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		System.out.println("Java 8");
		list.stream().filter(n -> Collections.frequency(list, n) > 1).collect(Collectors.toSet()).stream()
				.forEach(n -> {
					System.out.print(n + ",");
				});

	}

	private static void thirdWay(int[] arr) {
		Set<Integer> set = new HashSet<>();
		Set<Integer> duplicate = new HashSet<>();
		for (int i : arr) {
			if (!set.add(i)) {
				duplicate.add(i);
			}
		}
		System.out.println(duplicate);

	}

}