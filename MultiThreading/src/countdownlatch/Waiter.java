package countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Waiter implements Runnable
{

	CountDownLatch latch = null;

	public Waiter(CountDownLatch latch)
	{
		this.latch = latch;
	}

	public void run()
	{
		try
		{
			System.out.println("waiting for count 0...");
			latch.await();
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}

		System.out.println("Waiter Released");
	}
}
