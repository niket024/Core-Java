public class A
{

	public static void main(String[] args)
	{
		String password = args[0];
		System.out.println(password);
		//assert false ;//simple 
		assert false : "your progarm is going to be terminated due to some bussiness logic";

		System.out.println("main2");

	}
}
