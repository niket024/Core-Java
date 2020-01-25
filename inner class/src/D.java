public class D
{
	class E
	{
		int i = 90;
	}

	public static void main(String[] args)
	{
		D d1=new D();
		E e1=d1.new E();
		System.out.println(e1.i);
	}
}
