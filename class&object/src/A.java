//Encapsulation

public class A
{
	static int i = 89;
	int j;

	public static void main(String[] args)
	{
		A a1 = new A();// object creation
		i=90;
		System.out.println(A.i);
		System.out.println(a1.j);
	}
}
