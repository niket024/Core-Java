package foreach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ForEachListSum
{
	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4,
				5, 6, 6));
		// Before Java8
		int sum = 0;
		for (Integer i : list)
		{
			sum += i;
		}
		System.out.println("Sum = " + sum);

		// After Java8
		// summing list elements
		System.out
				.println("------------Summing each element of list---------------");
		int sum1 = list.stream().collect(Collectors.summingInt(n -> n));																		
																		
		System.out.println("Sum1 = " + sum1);
		System.out.println("------------summing only even no---------------");
		int sum2 = list.stream().filter(n -> n % 2 == 0) // finding even no.
				.collect(Collectors.summingInt(n -> n));
		System.out.println("Sum2 = " + sum2);

	}
}
