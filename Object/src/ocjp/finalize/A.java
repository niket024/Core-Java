package ocjp.finalize;

public class A
{
	int i = 90;

	public static void main(String[] args)
	{
		A a1 = new A();
		a1 = null;
		//System.out.println(a1.i);
		//System.gc();
		Runtime.getRuntime().gc();
		System.out.println("main");
		

	}
	@Override
	protected void finalize() throws Throwable
	{
		System.out.println("finalize");
	}
}
