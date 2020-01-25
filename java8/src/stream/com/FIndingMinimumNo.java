package stream.com;

import java.util.stream.IntStream;

public class FIndingMinimumNo
{
	public static void main(String[] args)
	{
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

		// Java 7
		int min = arr[0];
		for (int i = 1; i < arr.length; i++)
		{
			if (min > arr[i])
			{
				min = arr[i];
			}

		}
		System.out.println("*********Java 7******");
		System.out.println("Minimum no is :" + min);

		// Java 8
		int minimum = IntStream.of(arr).min().getAsInt();
		System.out.println("*********Java 8******");
		System.out.println("Minimum no is :" + minimum);
		IntStream.of(arr).min()
				.ifPresent(min1 -> System.out.println("minimum=" + min1));
		IntStream.of(arr).max()
				.ifPresent(max -> System.out.println("maximum=" + max));
		IntStream.of(arr).average()
				.ifPresent(avg -> System.out.println("avg=" + avg));
		int sum = IntStream.of(arr).sum();
		System.out.println("sum=" + sum);
		int count = (int)IntStream.of(arr).count();
		System.out.println("count=" + count);
		//Note: Here we are passing int array again and again. bet would be 

	}
}
