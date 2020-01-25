public class C
{
	public static void main(String[] args)
	{
		int x[] = { 12, 34, 34, 56 ,90};
		int y[]=x;
		y[0]=89;
		System.out.println(x[0]);
		System.out.println(y[0]);

	}
}
