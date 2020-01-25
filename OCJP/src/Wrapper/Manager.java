package Wrapper;

public class Manager
{
	/*static void test(int i)
	{
		System.out.println("primitive");
	}*/

	static void test(Integer i)
	{
		System.out.println("Derived");
	}
	public static void main(String[] args)
	{
		int i=23;
		test(i);
		Integer obj=new Integer(78);
		test(obj);
	}
}
