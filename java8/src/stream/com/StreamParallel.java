package stream.com;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamParallel {
	public static void main(String[] args) {
		int[] newArr = IntStream.range(0, 100000000).toArray();
		IntStream stream = Arrays.stream(newArr);
		IntStream stream1 = Arrays.stream(newArr);
		Instant start = Instant.now();

		// Finding count of even no till 100000000 without parallel
		System.out.println(stream.filter(n -> n % 2 == 0).count());
		Instant finish = Instant.now();

		long timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Time taken without parallel in milli seconds: " + timeElapsed);
		// Finding count of even no till 100000000 with parallel

		Instant start1 = Instant.now();
		System.out.println(stream1.parallel().filter(n -> n % 2 == 0).count());
		Instant finish1 = Instant.now();

		long timeElapsed1 = Duration.between(start1, finish1).toMillis();
		System.out.println("Time taken by parallel in milli seconds: " + timeElapsed1);
		// without lambda
		Instant start2 = Instant.now();
		int count = 0;
		for (int i : newArr) {
			if (i % 2 == 0) {
				count++;
			}
		}
		System.out.println(count);
		Instant finish2 = Instant.now();
		long timeElapsed2 = Duration.between(start2, finish2).toMillis();

		System.out.println("Time taken without lambda in milli seconds: " + timeElapsed2);

	}
}
