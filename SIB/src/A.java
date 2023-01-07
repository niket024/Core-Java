public class A
{
	
	static
	{
		//cibil score
		System.out.println("SIB");
	}
	
	A(){
		
		System.out.println("cons1");
	}
	static void test()
	{
		System.out.println("test");
	}
	public static void main(String[] args)
	{
		A a1 = new A();
		A a2 = new A();
	}
	
}
