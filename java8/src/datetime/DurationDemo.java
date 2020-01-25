package datetime;

import java.time.Duration;
import java.time.Instant;

public class DurationDemo {
	public static void main(String[] args) {
		Duration duration = Duration.ofMillis(5000);
		System.out.println(duration.toString()); // PT5S

		duration = Duration.ofSeconds(60);
		System.out.println(duration.toString()); // PT1M

		duration = Duration.ofMinutes(10);
		System.out.println(duration.toString()); // PT10M

		duration = Duration.ofHours(2);
		System.out.println(duration.toString()); // PT2H

		//we can use this technique to find time taken by algorithms.
		//refer PerformanceTestOfLambda.java
		duration = Duration.between(Instant.now(), Instant.now().plus(Duration.ofMinutes(10)));
		System.out.println(duration.toString()); // PT10M
		System.out.println(duration.toMillis());
	}
}
