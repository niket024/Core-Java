package countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Decrementer implements Runnable
{

	CountDownLatch latch = null;

	public Decrementer(CountDownLatch latch)
	{
		this.latch = latch;
	}

	public void run()
	{

		try
		{
			Thread.sleep(1000);
			this.latch.countDown();
			System.out.println("Current reach: " + latch.getCount());
			Thread.sleep(1000);
			this.latch.countDown();
			System.out.println("Current reach: " + latch.getCount());
			Thread.sleep(1000);
			this.latch.countDown();
			System.out.println("Current reach: " + latch.getCount());

		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
