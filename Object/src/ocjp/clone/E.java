package ocjp.clone;

class D
{
	int i;
}

public class E implements Cloneable
{
	D d1;
	int j;

	public static void main(String[] args) throws CloneNotSupportedException
	{
		E e1 = new E();
		e1.d1 = new D();
		e1.d1.i = 20;
		e1.j = 45;
		E e2 = (E) e1.clone();
		System.out.println(e2.d1.i);
		System.out.println(e2.j);
		e2.d1.i = 100;
		e2.j = 200;
		System.out.println(e1.d1.i);
		System.out.println(e1.j);
	}
}
