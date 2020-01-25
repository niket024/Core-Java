import java.util.Calendar;
import java.util.Date;

public class H
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		// cal.add(Calendar.DATE, 1);
		cal.add(Calendar.MONTH, 1);
		//cal.add(Calendar.YEAR, -1);
		Date d1 = cal.getTime();
		System.out.println(d1);

	}
}
