package foreach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ForEachListAvg {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 6));
		// Before Java8
		double sum = 0;
		for (Integer i : list) {
			sum += i;
		}
		System.out.println("Avg = " + sum / list.size());
		// finding count of even no
		int count1 = 0;
		for (Integer i : list) {
			if (i % 2 == 0) {
				count1++;
			}
		}
		System.out.println("Count of even no = " + count1);

		double avg1 = list.stream().collect(Collectors.averagingInt(n -> n));
		System.out.println("Avg = " + avg1);

		/*
		 * After Java8 summing list elements
		 */
		/*
		 * System.out
		 * .println("------------Averaging each element of list---------------" );
		 * double sum1 = list.stream().collect(Collectors.averagingInt(n -> n));
		 * 
		 * System.out.println("Avg = " + sum1);
		 * System.out.println("------------Averaging only even no---------------" );
		 * double sum2 = list.stream().filter(n -> n % 2 == 0) // finding even no.
		 * .collect(Collectors.averagingInt(n -> n)); System.out.println("Avg = " +
		 * sum2);
		 * 
		 * // finding count of even no
		 * System.out.println("------------counting only even no---------------" );
		 */
		Long count = list.stream().filter(n -> n % 2 == 0) // finding even no.
				.collect(Collectors.counting());
		System.out.println("Count of even no = " + count);

	}
}
