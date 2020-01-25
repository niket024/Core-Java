package stream.com;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class OddEvenSum
{
	public static void main(String[] args)
	{

		List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5);

		Predicate<Integer> evenFunc = (a) -> a % 2 == 0;
		Predicate<Integer> oddFunc = evenFunc.negate();
																																																																																																
		int evenSum = lst.stream().filter(evenFunc).mapToInt((a) -> a).sum();
		int oddSum = lst.stream().filter(oddFunc).mapToInt((a) -> a).sum();

		System.out.println("EVEN SUM = " + evenSum);
		System.out.println("ODD SUM =" + oddSum);

		System.out.println("----------------------");
		// if else in stream
		Consumer<Integer> action = i -> {

			if (i % 2 == 0)
			{
				System.out.println("Even number :: " + i);
			} else
			{
				System.out.println("Odd  number :: " + i);
			}
		};

		lst.stream().forEach(action);

	}
}
