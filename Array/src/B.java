public class B
{
	public static void main(String arg[])
	{
		// int x[]=new int [10];
		// int[] x=new int[10];
		// int [] x=new int [90];
		int[] x = { 12, 34, 45, 67, 89, 77 };
		int j = 0;
		for (int i : x)// enhanced/foreach
		{

			System.out.println(i);

		}
		System.out.println("Length=" + x.length);
	}
}
