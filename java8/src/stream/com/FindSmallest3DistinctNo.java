package stream.com;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindSmallest3DistinctNo
{
	public static void main(String[] args)
	{
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		// Java 7
		// do not modify original array
		int tempArr[] = Arrays.copyOf(arr, arr.length);
		Arrays.sort(tempArr);
		System.out.println("*****Java 7************");
		for (int i = 0; i < 3; i++)
		{
			System.out.println(tempArr[i]);
		}

		// Java 8
		System.out.println("*****Java 8************");
		System.out.println("Only top 3 elements");

		IntStream.of(arr).distinct().sorted().limit(3)
				.forEach(System.out::println);

		System.out.println("Skipping top 3 elements");

		IntStream.of(arr).distinct().sorted().skip(3)
				.forEach(System.out::println);
		int sum = IntStream.of(arr).distinct().sorted().limit(3).sum();

		System.out.println("Sum of top 3 elements = " + sum);
		// Stream is not changing the original arrayF
		System.out.println("Original array:" + Arrays.toString(arr));
	}
}
