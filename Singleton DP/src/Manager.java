
public class Manager
{
	public static void main(String[] args)
	{
		A a1 = A.getObject();
		A.getObject().test();
		
		B b1=B.getObject();
		b1.test();
		Runtime.getRuntime().gc();
		//Runtime r1 = new Runtime();
	}
}
