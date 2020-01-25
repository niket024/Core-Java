import java.util.Calendar;

public class F
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		System.out.println(Thread.currentThread().getContextClassLoader().getResource("BANNER_APP_CONFIG"));
	}
}
