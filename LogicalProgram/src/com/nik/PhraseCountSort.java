package com.nik;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Problem for sorting most occurring string pattern in a random text
 */
public class PhraseCountSort {
	public static void main(String[] args) {

		String input = "my name is john jane doe jane doe doe my name is jane doe doe my jane doe name is jane doe I go by the name of john joe jane doe is my name";

		Map<String, Long> count = Stream.of(input.split(" "))
				.collect(Collectors.groupingBy(l -> l, Collectors.counting()));
		System.out.println(count);
		// Sort map by value in Java 7
		firstWay(count);
		// Java 8
		anotherWay(count);
	}

	private static void firstWay(Map<String, Long> count) {
		@SuppressWarnings("unchecked")
		Map.Entry<String, Long> entries[] = count.entrySet().toArray(new Map.Entry[0]);
		System.out.println("***************Before sorting*****************");
		printCount(entries);
		Arrays.sort(entries, new Comparator<Map.Entry<String, Long>>() {
			@Override
			public int compare(Entry<String, Long> o1, Entry<String, Long> o2) {

				return o2.getValue().compareTo(o1.getValue());
			}

		});
		System.out.println("******************After sorting************");
		printCount(entries);
	}

	private static void printCount(Map.Entry<String, Long>[] entries) {
		for (Map.Entry<String, Long> entry : entries) {
			System.out.println(entry.getValue() + ":" + entry.getKey());
		}
	}

	public static void anotherWay(Map<String, Long> count) {
		System.out.println("----------Java 8-------------");
		Map<String, Long> count1 = count.entrySet().stream()
				.sorted(Map.Entry.<String, Long>comparingByValue().reversed())
				.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e1, LinkedHashMap::new));
		count1.forEach((k, v) -> System.out.println(k + ":" + v));
	}
}
