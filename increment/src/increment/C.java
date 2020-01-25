package increment;

public class C
{
	public static void main(String[] args)
	{
		int i = 10;
		int j = i++ + i++ + i + i++;
		System.out.println(i);
		System.out.println(j);
	}
}
