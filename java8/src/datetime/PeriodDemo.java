package datetime;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {
	public static void main(String[] args) {
		Period period = Period.ofDays(6);
		System.out.println(period.toString()); // P6D

		period = Period.ofMonths(6);
		System.out.println(period.toString()); // P6M

		period = Period.between(LocalDate.now(), LocalDate.now().plusDays(60));
		System.out.println(period.toString()); // P1M29D
	}
}
