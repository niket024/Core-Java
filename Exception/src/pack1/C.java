package pack1;

public class C
{

	public static void main(String[] args)
	{
		try
		{
			int j = 10 / 0;
			System.out.println("try");
			System.out.println("try");
			System.out.println("try");
			System.out.println("try");
			System.out.println("try");
			System.out.println("try");
		} catch (ArithmeticException ex)
		{
			System.out.println("catch");
		}
		System.out.println("main");
	}
}
