
public class B extends Thread
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
		B b2 = new B();
		b2.start();
		//b1.start();
		b2.run();
		for (int i = 2000; i < 4000; i++)
		{
			System.out.println(i);
		}
	}
}