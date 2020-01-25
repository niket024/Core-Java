package foreach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachListWithAction
{
	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4,
				5, 6));
		// Before Java8
		// printing even no
		for (Integer i : list)
		{
			if (i % 2 == 0)
				System.out.println(i);
		}
		// After Java8
		// Printing even no
		System.out
				.println("------------Iterating by passing method reference---------------");
		list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
		System.out
				.println("------------Iterating by passing lambda expression---------------");
		list.stream().filter(n -> n % 2 == 0)
				.forEach(l -> System.out.println(l));

	}
}
