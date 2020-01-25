public enum Nik {
	CON1,CON4(10), CON2(20,40), CON3;
	Nik()
	{
		System.out.println("con1");
	}

	Nik(int i)
	{
		System.out.println("con4");
	}
	Nik(int i,int j)
	{
		System.out.println("con2");
	}

	static void test()
	{
		System.out.println("test");
	}
	 void test1()
	{
		System.out.println("test1");
	}

	public static void main(String[] args)
	{
		// Nik n1=new Nik();
		Nik n = Nik.CON1;
		CON1.test();
		n.test1();
		System.out.println("main");
	}
}
