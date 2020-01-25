package stream.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateCountInArray
{
	public static void main(String[] args)
	{
		Integer arr[] = { 1, 2, 3, 4, 4, 6, 4, 8, 2, 2 };
		// Java 7
		Map<Integer, Integer> dupliacteCount = new HashMap<Integer, Integer>();
		for (int i : arr)
		{
			if (dupliacteCount.containsKey(i))
			{
				int count = dupliacteCount.get(i);
				dupliacteCount.put(i, ++count);
			} else
			{
				dupliacteCount.put(i, 1);

			}
		}
		System.out.println("*************java 7******************");
		System.out.println(dupliacteCount);
		List<Integer> list = Arrays.asList(arr);
		List<String> duplicateCount1 = new ArrayList<>();
		for (int i : list)
		{
			String val = i + "=" + Collections.frequency(list, i);
			if (!duplicateCount1.contains(val))
				duplicateCount1.add(val);

		}
		System.out.println(duplicateCount1);
		// java 8

		// If primitive array then uncomment this
		/*
		 * Map<Integer, Long> dupliacteCount1 = IntStream .of(arr) .boxed()
		 * .sequential() .collect( Collectors.groupingBy(Function.identity(),
		 * Collectors.counting()));
		 */
		System.out.println("*************java 8******************");

		Map<Integer, Long> dupliacteCount1 = Stream.of(arr).collect(
				Collectors.groupingBy(n -> n, Collectors.counting()));
		dupliacteCount1.entrySet().stream().forEach(map -> {
			System.out.println(map.getKey() + "=" + map.getValue());
		});

		String[] chars = { "A", "B", "C", "A", "C", "A" };

		Map<String, Long> freq = Stream.of(chars).collect(
				Collectors.groupingBy(Function.identity(),
						Collectors.counting()));
		// Iterating map in java 8
		freq.forEach((k, v) -> System.out.println("key=" + k + ", value " + v));
		// Iterating map after filter in java 8

	}
}
