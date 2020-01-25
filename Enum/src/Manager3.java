public class Manager3
{
	enum Test 
	{
		t1, t2, t3, t4, t5;
		
	}

	public static void main(String[] args)
	{
		Test x[] = Test.values();
		for (Test t : x)
		{
			System.out.println(t);
			System.out.println(t.ordinal());

		}
		System.out.println("-----");
		System.out.println(Test.valueOf("t4"));
		System.out.println(Test.valueOf("t5"));
	}
}
