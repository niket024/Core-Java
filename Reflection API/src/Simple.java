
class test2
{
	
}
class Simple
{
	public static void main(String args[]) throws Exception
	{
		Class c = Class.forName("test2");
		System.out.println(c.getName());
	}
}