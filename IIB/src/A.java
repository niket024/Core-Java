public class A
{
	int common;
	
	{
		common = 10;
		System.out.println("IIB");
	}
	
	A(){
		
		System.out.println("cons1");
	}
	A(int i){
		
		System.out.println("cons2");
	}
	public static void main(String[] args)
	{
		A a1 = new A();
		A a2 = new A(12);
		System.out.println(a1.common);
		System.out.println(a2.common);
		System.out.println("main");

	}
}
