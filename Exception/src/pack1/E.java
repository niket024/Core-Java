package pack1;

public class E
{

	public static void main(String[] args)
	{
		System.out.println("main1");
		try
		{
			System.out.println("try");
			int i = 10 / 5;
			String s1 = null;
			s1.length();
		}
		 //int i=90;//unreachable stmt
		catch (ArithmeticException ex)
		{
			System.out.println(ex);
		}
		catch (NullPointerException ex)
		{
			System.out.println(ex);
			System.out.println("catch");
		}
		System.out.println("main2");
	}
}
