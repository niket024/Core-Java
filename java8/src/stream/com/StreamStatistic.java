package stream.com;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class StreamStatistic
{
	public static void main(String[] args)
	{
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		IntSummaryStatistics intSummaryStatistics = IntStream.of(arr)
				.summaryStatistics();
		System.out.println("Min = " + intSummaryStatistics.getMin());
		System.out.println("Max = " + intSummaryStatistics.getMax());
		System.out.println("Avaegrage = " + intSummaryStatistics.getAverage());
		System.out.println("Sum = " + intSummaryStatistics.getSum());
		System.out.println("Count = " + intSummaryStatistics.getCount());
		System.out.println(intSummaryStatistics);
		IntStream.of(arr).sum();
	}
}
