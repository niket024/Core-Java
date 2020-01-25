package stream.com;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamMore
{
	public static void main(String[] args)
	{
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		System.out.println(IntStream.of(arr).average());
		System.out.println(IntStream.of(arr).min());
		System.out.println(IntStream.of(arr).max());
		System.out.println(IntStream.of(arr).sum());
		System.out.println(IntStream.of(arr).count());

		System.out.println(IntStream.of(arr).anyMatch(n -> n % 2 == 0));
		System.out.println(IntStream.of(arr).allMatch(n -> n % 2 == 0));

		IntStream.range(1, 100).forEach(System.out::print);
		System.out.println();
		IntStream.range(1, 100).forEach(n -> {
			System.out.print(n + ", ");
		});
		System.out.println();
		List<Integer> list = IntStream.range(1, 100).boxed()
				.collect(Collectors.toList());
		System.out.println(list);
		//finding count even no.
		System.out.println(list.stream().filter(n -> n % 2 == 0).count());

	}
}
