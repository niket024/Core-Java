/**
 * 
 * @author niketk Eager Singleton
 */
public class B
{
	private B()
	{

	}

	static B b1 = null;
	static
	{
		b1 = new B();
	}
	public static B getObject()
	{
		return b1;
	}
	void test()
	{
		System.out.println("test from B");
	}
}
