import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class J
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		Date d1 = cal.getTime();

		System.out.println(d1);
		System.out.println("--------------");
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, new Locale("pak"));

		String s1 = df.format(d1);
		System.out.println(s1);
	}
}
