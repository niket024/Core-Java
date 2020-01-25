package datetime;

import java.time.LocalTime;

public class LocalTimeDemo {
	public static void main(String[] args) {
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime.toString()); // 12:20
		System.out.println(localTime.getHour()); // 12
		System.out.println(localTime.getMinute()); // 20
		System.out.println(localTime.getSecond()); // 0
		System.out.println(localTime.MIDNIGHT); // 00:00
		System.out.println(localTime.NOON); // 12:00 }
		System.out.println("-------------------");
		localTime = LocalTime.of(12, 20);
		System.out.println(localTime.toString());
	}
}
