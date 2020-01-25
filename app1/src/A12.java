public class A12
{

	@Override
	protected void finalize() throws Throwable
	{
		System.out.println("finalize");
	}

	public static void main(String[] args)
	{
		A1.j=90;
		A12 a1 = new A12();

		a1 = null;
		System.gc();

	}
}
