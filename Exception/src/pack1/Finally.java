package pack1;

public class Finally
{
	public static void main(String[] args)
	{
		int j = 10 / 0;
		try
		{
			System.out.println("try");

			int i = 90 / 0;
		} catch (NullPointerException ex)
		{
			System.out.println("catch");
		} 
		finally
		{
			System.out.println("finally");
		}
		System.out.println("main");
	}
}
