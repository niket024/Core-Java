package ocjp.finalize;

class B
{

}

public class Manager
{
	public static void main(String[] args)
	{
		B b1 = new B();
		B b2 = new B();
		System.out.println(b1 == b2);
		Class c1 = b1.getClass();
		Class c2 = b2.getClass();
		System.out.println(c1 == c2);
	}
}
