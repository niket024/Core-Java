public class E extends Thread
{


	@Override
	public void run()
	{
		for (int i = 0; i < 2000; i++)
		{
			System.out.println(i);
			
		}
	}

	public static void main(String[] args) throws InterruptedException
	{
		E e1 = new E();
		e1.start();
		for (int i = 10; i < 20000; i++)
		{
			Thread.sleep(2000);

			System.out.println(i);
		}
	}
}
