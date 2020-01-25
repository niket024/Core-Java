public class A1
{
	int i = 100;


	public static void main(String[] args)
	{
		String s1="abc";
		A1 a1 = new A1();
		System.out.println(a1.toString());
		System.out.println(s1.toString());
		
	}

	@Override
	public String toString()
	{
		return "" +i;
	}

}
