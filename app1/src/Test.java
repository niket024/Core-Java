class Simple1
{
	
}

class Test
{
	void printName(Simple1 obj)
	{
		Class c = obj.getClass();
		//System.out.println(c==obj);
		System.out.println(c.getName());
		c.
	}

	public static void main(String args[])
	{
		Simple1 s = new Simple1();

		Test t = new Test();
		t.printName(s);
	}
}