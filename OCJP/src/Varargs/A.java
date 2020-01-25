package Varargs;

public class A
{
	static void test(Byte b1,Byte b2)
	{
		System.out.println("Byte");
	}
	static void test(byte... b1)
	{
		System.out.println("byte");
	}
public static void main(String[] args)
{
	byte b=10;
	test(b,b,b,b,b,b);
//	test(b,b,b);
//	test(b,b,b,b);
}
}
