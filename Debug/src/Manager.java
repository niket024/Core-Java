public class Manager
{
	public static void main(String[] args)
	{
		int i = 0;
		i++;
		i++;
		++i;
		i=test(i);
		i--;
		--i;
		i = i + 5;
		System.out.println(i);
	}
	static int test(int i)
	{
		System.out.println("test:"+i);
		return ++i;
	}
}
