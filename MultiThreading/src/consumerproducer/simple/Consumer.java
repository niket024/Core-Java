package consumerproducer.simple;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable
{
	protected BlockingQueue<String> queue = null;

	public Consumer(BlockingQueue<String> queue)
	{
		this.queue = queue;
	}

	public void run()
	{
		try
		{
			System.out.println("consumed: " + queue.take());
			System.out.println("consumed: " + queue.take());
			System.out.println("consumed: " + queue.take());
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
