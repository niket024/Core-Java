package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeTwoList {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 6));

		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 6));

		List<Integer> list3 = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
		System.out.println(list3);

		// Summing the two list
		List<Object> list4 = IntStream.range(0, list1.size()).mapToObj(i -> list1.get(i) + list2.get(i))
				.collect(Collectors.toList());
		System.out.println(list4);

	}
}
