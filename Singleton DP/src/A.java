/**
 * 
 * @author niketk
 *Lazy Singelton
 */
public class A
{
	private A()
	{
		
	}
	static A a1=null;
	public static A getObject()
	{
		if(a1==null)
		{
			a1=new A();
		}
		return a1;
	}
	void test()
	{
		System.out.println("test from A");
	}
}
