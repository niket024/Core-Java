package thread;
/*
 * This program can go for infinite loop
 */
public class WithoutVolatile1
{
	private static  int MY_INT = 0;
	Thread t1 = new Thread(new Runnable()
	{
		public void run()
		{
			int local_value = MY_INT;
			while (local_value < 5)
			{
				if (local_value != MY_INT)
				{
					System.out.println("Got Change for MY_INT :" + MY_INT);
					local_value = MY_INT;
				}
			}

		}
	});
	Thread t2 = new Thread(new Runnable()
	{
		public void run()
		{
			int local_value = MY_INT;
			while (MY_INT < 5)
			{
				System.out.println("Incrementing MY_INT to :" + local_value
						);
				MY_INT = ++local_value;
				try
				{
					Thread.sleep(500);
				} catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		}
	});

	public static void main(String[] args)
	{
		WithoutVolatile1 volatile1 = new WithoutVolatile1();
		volatile1.t1.start();
		volatile1.t2.start();
	}
}
