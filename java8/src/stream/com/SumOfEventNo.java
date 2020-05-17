package stream.com;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SumOfEventNo {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

		// Java 7
		int sum = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				sum += arr[i];
			}

		}
		System.out.println("*********Java 7******");
		System.out.println("Sum of even no is  :" + sum);

		// Java 8
		System.out.println("*********Java 8******");

		int sum1 = IntStream.of(arr).filter(n -> n % 2 == 0).sum();
		System.out.println("Sum of even no is  :" + sum1);

		// Collecting square of the elements
		List<Integer> list = IntStream.of(arr).map(n -> n * n).boxed().collect(Collectors.toList());
		System.out.println(list);

		// Collecting square of the elements in map
		Map<Integer, Integer> map = IntStream.of(arr).map(n -> n).boxed().collect(Collectors.toMap(n -> n, n -> n * n));
		System.out.println(map);

		// finding sum of list with reduce
		List<Integer> list1 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0).collect(Collectors.toList());
		int sum123 = list1.stream().reduce((a, b) -> a + b).get();
		System.out.println(sum123);
	}
}
