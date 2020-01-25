package stream;

import java.util.Random;
import java.util.stream.Stream;

public class StreamBuilders3
{
	public static void main(String[] args)
	{
		Stream<Integer> random = Stream.generate(() -> {
			return new Random().nextInt();
		});
		random.forEach(System.out::println);
	}
}
