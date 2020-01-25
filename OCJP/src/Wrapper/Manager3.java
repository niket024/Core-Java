package Wrapper;

/*
 * You will get compile time error as The method test(Integer) is ambiguous for the type Test
 *  because both String and Integer class have Object as parent class and there is no inheritance. 
 *  So java compiler doesn’t consider any of them to be more specific, hence the method ambiguous call error.
 */
public class Manager3
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
		manager3.test(null);
	}
}
