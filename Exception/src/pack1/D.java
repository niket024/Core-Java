package pack1;

public class D
{
	public static void main(String[] args)
	{
		System.out.println("main1");
		try
		{
			System.out.println("try1");
			try
			{
				System.out.println("try2");
				int k = 90 / 0;
			} 
			catch (ArithmeticException ex1)
			{
				System.out.println("catch1");
			}
			int i = 10 / 0;

		} 
		catch (ArithmeticException ex)
		{
			System.out.println("catch2");
		}
		System.out.println("main2");

	}
}
