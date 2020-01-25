public class A
{
	String bankName;
	A()
	{
		
		System.out.println("cons");
		System.out.println(bankName);
	}

	A(int i)
	{
		
		System.out.println("cons1");
		System.out.println(bankName);
	}

	{
		System.out.println("IIb");
		bankName = "HDFC";
	}
	
	public static void main(String[] args)
	{
		A a1 = new A();
		A a2 = new A(12);
		System.out.println("main");

	}
}
