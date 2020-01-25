package stream.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayToList {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		List<Integer> list = IntStream.of(arr).boxed().collect(Collectors.toList());
		System.out.println(list);
		
		System.out.println(Arrays.toString(list.toArray()));

	}
}
