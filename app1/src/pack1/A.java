package pack1;

public class A
{
	int i = 90;

	public static void main(String[] args) throws Exception
	{
		A a2 = new A();
		Class c = a2.getClass();
		Class d = Class.forName("pack1.A");
		A a3=(A) c.newInstance();
		System.out.println(a3 instanceof A);
		System.out.println(d instanceof Class);
		System.out.println(c.isInterface());
		System.out.println(a2.getClass());
		A a4 = (A) c.newInstance();
		System.out.println(a4 instanceof A);
		System.out.println(a4.i);
		System.out.println("main");
	}
}
