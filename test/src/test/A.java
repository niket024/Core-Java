package test;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class A {
	public static void main(String[] args) {
		// programming way
		int x = 90;
		String stmt = "";
		if (x > 50) {
			stmt = "heavy";
		} else {
			stmt = "Not heavy";
		}
		System.out.println(stmt);

		// expressive way
		System.out.println(x > 50 ? "heavy" : "not heavy");
		List<Integer> list = IntStream.range(0, 500000).boxed().collect(Collectors.toList());
		getEven(list);
	}

	private static void getEven(List<Integer> list) {
		Instant start1 = Instant.now();
		int count = 0;
		// not scalable
		for (int i : list) {
			if (i % 2 == 0) {
				count++;
			}
		}
		System.out.println(count);
		Instant end1 = Instant.now();
		System.out.println("Time taken without lambda " + Duration.between(start1, end1).toMillis());

		System.out.println("------------------");
		// scalable
		Instant start2 = Instant.now();

		long count2 = list.parallelStream().filter(i -> i % 2 == 0).count();
		System.out.println(count2);
		Instant end2 = Instant.now();
		System.out.println("Time taken with lambda " + Duration.between(start2, end2).toMillis());

	}

}
