package datetime;

import java.time.Duration;
import java.time.Instant;

public class InstantDemo {
	public static void main(String[] args) {
		Instant instant = Instant.now();
		System.out.println(instant.toString()); // 2013-05-15T05:20:08.145Z
		System.out.println(instant.plus(Duration.ofMillis(5000)).toString()); // 2013-05-15T05:20:13.145Z
		System.out.println(instant.minus(Duration.ofMillis(5000)).toString()); // 2013-05-15T05:20:03.145Z
		System.out.println(instant.minusSeconds(10).toString()); // 2013-05-15T05:19:58.145Z

	}
}
