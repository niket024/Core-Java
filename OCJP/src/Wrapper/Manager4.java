package Wrapper;

/*
 * No compile time error because we are passing Integer type as parameter
 */
public class Manager4
{
	public void test(String s1)
	{
		System.out.println("test->String");
	}

	public void test(Integer obj)
	{
		System.out.println("test->Integer");

	}

	public static void main(String[] args)
	{
		Manager3 manager3 = new Manager3();
		Integer i1 = null;
		manager3.test(i1);
	}
}
