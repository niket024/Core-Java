package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamWithList1
{
	public static void main(String[] args)
	{
		//till java 7
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 10; i++)
		{
			list.add(i);
		}
		
		//from Java 8
		Stream<Integer> stream = list.stream();
		List<Integer> evenNumbersList = stream.filter(i -> i % 2 == 0).collect(
				Collectors.toList());
		System.out.print(evenNumbersList);
	}
}
