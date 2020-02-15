package com.nik.problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class FIndingDuplicateCount
{
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(1, 3, 4, 5, 6, 7, 8, 5, 5, 3, 2, 1,
				8, 9);
		method1(list);
		method2(list);
	}

	private static void method2(List<Integer> list)
	{
		Set<Integer> set = new HashSet<>(list);
		for (Integer i : set)
		{
			System.out.println(i + ":" + Collections.frequency(list, i));
		}

	}

	private static void method1(List<Integer> list)
	{
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for (Integer i : list)
		{
			if (!map.containsKey(i))
			{
				map.put(i, Collections.frequency(list, i));
			}
		}
		System.out.println(map);
	}
}
