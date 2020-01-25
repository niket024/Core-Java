import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class I
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		Date d1 = cal.getTime();
		System.out.println(d1);
		System.out.println("--------------");
	 //DateFormat df=DateFormat.getDateInstance(DateFormat.SHORT);
		 DateFormat df=DateFormat.getDateInstance(DateFormat.MEDIUM);
	    // DateFormat df=DateFormat.getDateInstance(DateFormat.LONG);
		//DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		String s1 = df.format(d1);
		System.out.println(s1);
	}
}
