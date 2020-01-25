package Wrapper;

/*
 * Bellow program compiles perfectly and when we run it, it prints “test->String”.

 So the method test(String s) was called by the program. 
 The reason behind this is java compiler tries to find out the method with most specific input parameters to invoke a method.
  We know that Object is the parent class of String, so the choice was easy. Here is the excerpt from Java Language Specification.
 */
public class Manager2
{
	public void test(String s1)
	{
		System.out.println("test->String");
	}

	public void test(Object obj)
	{
		System.out.println("test->Object");

	}

	public static void main(String[] args)
	{
		Manager2 manager2 = new Manager2();
		manager2.test(null);
	}
}
