package stream.com;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class IteratingMap {
	public static void main(String[] args) {
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B1", 20);
		items.put("C", 30);
		items.put("D1", 40);
		items.put("E", 50);
		items.put("F1", 60);
		System.out.println(items);
		System.out.println("Java 7");
		iterateMapJava7Way(items);
		System.out.println("Java 8");
		iterateMapJava8Way(items);

		// filtering
		filterInJava8Way(items);

		// sorting map by value
		sortMapByValueInJava8(items);
		// Java 7
		reverseMapInJava7(items);
		// Java 8
		reverseMapInJava8(items);

	}

	private static void reverseMapInJava7(Map<String, Integer> items) {
		Map<Integer, String> reverseMap = new HashMap<>();
		for (Map.Entry<String, Integer> entry : items.entrySet()) {
			reverseMap.put(entry.getValue(), entry.getKey());
		}
		System.out.println(reverseMap);

	}

	private static void reverseMapInJava8(Map<String, Integer> items) {
		Map<Integer, String> mapInversed = items.entrySet().stream()
				.collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
		mapInversed.forEach((k, v) -> System.out.println("key : " + k + " value : " + v));
	}

	private static void sortMapByValueInJava8(Map<String, Integer> items) {
		items.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue()).forEach(System.out::println);

		// The Map returned by the previous statement was not sorted because
		// ordering was lost while collecting result in Map you need to use the
		// LinkedHashMap to preserve the order
		Map<String, Integer> sortedByValue = items.entrySet().stream()
				.sorted(Map.Entry.<String, Integer>comparingByValue())
				.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
		System.out.println(sortedByValue);

		sortedByValue = items.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue())
				.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2, LinkedHashMap::new));
		System.out.println(sortedByValue);
	}

	private static void filterInJava8Way(Map<String, Integer> items) {
		items.forEach((k, v) -> {
			if ("E".equals(k)) {
				System.out.println("Hello E");
			}
		});
	}

	private static void iterateMapJava8Way(Map<String, Integer> items) {
		items.forEach((k, v) -> System.out.println("key : " + k + " value : " + v));
	}

	private static void iterateMapJava7Way(Map<String, Integer> items) {
		for (Map.Entry<String, Integer> entry : items.entrySet()) {
			System.out.println("key : " + entry.getKey() + " value : " + entry.getValue());
		}
	}
}
