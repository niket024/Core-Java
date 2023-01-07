class Test1
{
	public static void main(String args[])
	{
		Class c = int.class;
		System.out.println(c.getName());

		Class c2 = Test1.class;
		System.out.println(c2.getName());
	}
}