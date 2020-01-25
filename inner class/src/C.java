public class C
{
	public static void main(String[] args)
	{
		A.B b1 = new A.B();
		D d1=new D();
		D.E e1=new D().new E();
		System.out.println(b1.i);
		System.out.println(e1.i);
	}
}
