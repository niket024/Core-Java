package pack1;

public class Throws
{
	static void test() throws InterruptedException 
	{
		Thread.sleep(1000);
	}

	static void test1() throws InterruptedException 
	{
		test();
		
	}

	public static void main(String[] args) throws InterruptedException
	{
		
			test1();

		System.out.println("main");

	}
}
