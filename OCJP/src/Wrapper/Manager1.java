package Wrapper;

public class Manager1
{
//	static void test(byte i)
//	{
//		System.out.println("byte");
//	}

	/*static void test(short i)
	{
		System.out.println("short");
	}*/
/*	static void test(int i)
	{
		System.out.println("int");
	}
	static void test(long i)
	{
		System.out.println("long");
	}
	static void test(float i)
	{
		System.out.println("float");
	}
	static void test(double i)
	{
		System.out.println("double");
	}*/
//	static void test(Byte i)
//	{
//		System.out.println("Byte");
//	}
	static void test(Short i)
	{
		System.out.println("Short");
	}
	static void test(Integer i)
	{
		System.out.println("Integer");
	}
	static void test(Long i)
	{
		System.out.println("Long");
	}
	static void test(Float i)
	{
		System.out.println("Float");
	}
	static void test(Double i)
	{
		System.out.println("Double");
	}
	/*static void test(Number i)
	{
		System.out.println("Number");
	}*/
	static void test(Object i)
	{
		System.out.println("Object");
		System.out.println(i);
	}
	public static void main(String[] args)
	{
		byte b=12;
		test(b);
	}
}
