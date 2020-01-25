package stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBuilders2
{
	public static void main(String[] args)
	{
		Stream<Integer> stream = Stream.of(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
		//stream.forEach(p -> System.out.println(p));
		List<Integer> list = stream.collect(Collectors.toList());
		System.out.println(list);
	}
}
