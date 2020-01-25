package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamWithArray
{
	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 10; i++)
		{
			list.add(i);
		}
		Object[] evenNumbersArr1 = (Object[]) list.toArray();
		System.out.print(Arrays.toString(evenNumbersArr1));

		Stream<Integer> stream = list.stream();
		Integer[] evenNumbersArr = stream.filter(i -> i % 2 == 0).toArray(
				Integer[]::new);
		System.out.print(Arrays.toString(evenNumbersArr));
	}
}
