package thread;

import java.util.LinkedList;
import java.util.List;

public class BlockingQueueTest
{
	private List<String> queue = new LinkedList<String>();
	private int limit = 10;

	public BlockingQueueTest(int limit)
	{
		this.limit = limit;
	}

	public synchronized void enqueue(Object item) throws InterruptedException
	{
		while (this.queue.size() == this.limit)
		{
			wait();
		}
		if (this.queue.size() == 0)
		{
			notifyAll();
		}
		this.queue.add((String) item);
	}

	public synchronized Object dequeue() throws InterruptedException
	{
		while (this.queue.size() == 0)
		{
			wait();
		}
		if (this.queue.size() == this.limit)
		{
			notifyAll();
		}

		return this.queue.remove(0);
	}

	public static void main(String[] args)
	{
		BlockingQueueTest blockingQueueTest = new BlockingQueueTest(10);

		Runnable r1 = new Runnable()
		{

			@Override
			public void run()
			{
				try
				{
					while (true)
					{
						System.out.println("Enqueueing:abc");
						blockingQueueTest.enqueue(new String("abc"));
						//System.out.println(blockingQueueTest.queue.size());

					}
				} catch (InterruptedException e)
				{
					e.printStackTrace();
				}

			}
		};

		new Thread(r1).start();
		Runnable r2 = new Runnable()
		{

			@Override
			public void run()
			{
				try
				{
					while (true)
					{
						System.out.println("Dequeing:"+blockingQueueTest.dequeue());

					}
				} catch (InterruptedException e)
				{
					e.printStackTrace();
				}

			}
		};

		new Thread(r2).start();

	}
}
