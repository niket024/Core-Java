public class B
{
	static int i;
	int j;

	static void test()
	{
		B a3=new B();
		System.out.println(a3.j);
		System.out.println(a3.i);
		i = 10;
		System.out.println("test");
		System.out.println(a3.j);
		System.out.println(a3.i);
	}

	void test1()
	{
		B a4=new B();
		System.out.println(a4.j);
		System.out.println(a4.i);
		j = 20;
		i = 30;
		System.out.println("test1");
		System.out.println(a4.j);
		System.out.println(a4.i);
	}

	public static void main(String[] args)
	{
		B a1 = new B();
		System.out.println(a1.j);
		System.out.println(a1.i);
		a1.test1();
		a1.test();
		System.out.println(a1.i);
		System.out.println(a1.j);
		B a2 = new B();
		System.out.println(a2.j);
		System.out.println(a2.i);
		a2.test1();
		a2.test();
		System.out.println(a2.i);
		System.out.println(a2.j);
	}
}
