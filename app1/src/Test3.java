class Simple4
{
}

interface My
{
}

class Test3
{
	public static void main(String args[])
	{
		try
		{
			Class c = Class.forName("Simple4");
			System.out.println(c.isInterface());
        System.out.println(c.getSuperclass());
			Class c2 = Class.forName("My");
			System.out.println(c2.isInterface());

		} catch (Exception e)
		{
			System.out.println(e);
		}

	}
}