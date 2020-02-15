package com.nik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicateElement
{
	public static void main(String[] args)
	{

		// Initialize array
		int[] arr = new int[] { 1, 2, 3, 4, 2, 7, 8, 8, 3, 2, 7, 3, 8 };
		// Java 8
		List<Integer> list = Arrays.stream(arr).boxed()
				.collect(Collectors.toList());
		List<Integer> list1 = list.stream().distinct()
				.collect(Collectors.toList());
		System.out.println(list);
		System.out.println(list1);
		System.out.println("---------------------");
		// Java 7
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = i + 1; j < arr.length; j++)
			{
				if (arr[i] == arr[j])
					set.add(arr[j]);
			}
		}

		list.removeAll(set);
		list.addAll(set);
		System.out.println(list);

	}
}