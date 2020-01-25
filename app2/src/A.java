public class A
{
	public static void main(String[] args)
	{
		int a = 2, b;
		b = a++ + a + a-- + a++ + a;
		System.out.println(a);
		System.out.println(b);

	}
}
