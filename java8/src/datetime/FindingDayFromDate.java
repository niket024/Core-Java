package datetime;

import java.time.LocalDate;
import java.util.Scanner;

public class FindingDayFromDate {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your DOB");
		System.out.println("Enter date(1-31):");
		int dd = input.nextInt();
		System.out.println("Enter month(1-12): ");
		int month = input.nextInt();
		System.out.println("Enter year: ");
		int year = input.nextInt();
		LocalDate date = LocalDate.of(year, month, dd);
		System.out.println("You born on :" + date.getDayOfWeek());
		input.close();
	}
}
