public class A
{
	static int i;
	int j;

	static void test()
	{
		i = 10;
		System.out.println("test");
	}

	void test1()
	{
		A a2 = new A();
		System.out.println(i);
		System.out.println(j);
		a2.j = 34;
		i = 89;
		j = 20;
		i = 30;
		System.out.println("test1");
	}

	public static void main(String[] args)
	{
		A a1 = new A();
		System.out.println(a1.j);// 
		System.out.println(i);// 
		a1.test1();
		test();
		System.out.println(i);// 
		System.out.println(a1.j);// 
		A a2 = new A();
		System.out.println(a2.j);// 
		System.out.println(i);// 
		a2.test1();
		test();
		System.out.println(i);// 
		System.out.println(a2.j);// 
	}
}
