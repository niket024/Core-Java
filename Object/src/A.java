public class A
{
	int i=10;

	public static void main(String[] args)
	{
		A a1 = new A();
		A a2 = new A();
		A a3 = a2;
		System.out.println(a1.toString());
		System.out.println(a2);
		System.out.println(a3);
	}
	@Override
	public String toString()
	{
		return ""+i;
	}

}
