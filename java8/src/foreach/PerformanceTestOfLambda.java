package foreach;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PerformanceTestOfLambda
{
	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4,
				5, 6, 7, 55, 44, 33, 2, 6, 7, 8, 9, 0, 9, 8, 7, 6, 5, 4));
		// Before Java8
		Instant start = Instant.now();
		for (Integer i : list)
		{
			System.out.println(i);
		}
		Instant finish = Instant.now();
		System.out.println("Time taken without lambda in milli seconds:" + Duration.between(start, finish).toMillis());
		
		// After Java8
		System.out.println("------------Iterating by passing method reference---------------");
		Instant start1 = Instant.now();
		list.forEach(System.out::println);
		Instant finish1 = Instant.now();
		System.out.println("Time taken with lambda in milli seconds:" + Duration.between(start1, finish1).toMillis());

	}
}
