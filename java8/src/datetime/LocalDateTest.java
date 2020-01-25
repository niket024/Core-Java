package datetime;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LocalDateTest
{
	public static void main(String[] args)
	{
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate.toString());                //2013-05-15
		System.out.println(localDate.getDayOfWeek().toString()); //WEDNESDAY
		System.out.println(localDate.getDayOfMonth());           //15
		System.out.println(localDate.getDayOfYear());            //135
		System.out.println(localDate.isLeapYear());              //false
		System.out.println(localDate.plusDays(12).toString());   //2013-05-27
		
		System.out.println(ZonedDateTime.now(ZoneId.of("Asia/Calcutta")));
	}
}
