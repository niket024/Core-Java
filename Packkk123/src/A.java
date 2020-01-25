import java.util.Date;

public class A
{
	public static void main(String[] args)
	{

		test(new Date().getTime() + 120000l);
		System.out.println("main");
	}

	private static void test(long i)
	{
		long l = new Date().getTime();
		// //System.out.println(i);
		//System.out.println(l);
		;
		if (i == l)
		{
			// System.out.println("blocking");
			System.exit(0);
		} else
		{
			// System.out.println("running");
			test(i);
		}
	}
}
