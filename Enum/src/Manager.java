
public class Manager
{
	public static final String STATUS="Success";
	public static void main(String[] args)
	{

		Days d1 = Days.MON;
		Days d2 = Days.TUE;
		Days d3 = Days.FRI;
		Days d4 = Days.SUN;
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(Days.SAT);
		System.out.println(d1.ordinal());
	}

}
