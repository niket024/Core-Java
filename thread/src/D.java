public class D extends Thread
{
	@Override
	public void run()
	{
		for (int i = 0; i < 2000; i++)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args)
	{
		C c1 = new C();
		c1.setDaemon(true);
		c1.start();
		try
		{
			c1.join();
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		for (int i = 10; i < 20; i++)
		{
			System.out.println(i);
		}
	}
}
