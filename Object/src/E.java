public class E
{
	int i = 10;

	public static void main(String[] args)
	{
		E e1 = new E();
		//System.out.println(Runtime.getRuntime().freeMemory());
		e1 = null;
		//System.gc();
		Runtime.getRuntime().gc();
		//System.out.println(Runtime.getRuntime().freeMemory());

		//System.out.println(e1.i);
		System.out.println("main");
	}
	@Override
	protected void finalize() throws Throwable
	{
		System.out.println("finalize");
		super.finalize();
	}

}
