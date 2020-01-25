package concurrency;

import java.util.LinkedList;

public class ProdConWithWaitNotify
{

	static int i = 0;
	int max;
	LinkedList<Integer> item;
	Object object = new Object();

	public ProdConWithWaitNotify(int max)
	{
		super();
		this.max = max;
		this.item = new LinkedList<Integer>();
	}

	public void put(Integer i)
	{
		synchronized (object)
		{
			if (item.size() == max)
			{
				try
				{
					wait();
				} catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			item.add(i);
			notifyAll();
		}

	}

	public int take()
	{
		synchronized (object)
		{

			try
			{
				if (item.size() == 0)
				{
					try
					{
						wait();
					} catch (InterruptedException e)
					{
						e.printStackTrace();
					}
				}
				notifyAll();
				return item.remove();

			} finally
			{

			}
		}
	}

	public static void main(String[] args)
	{

		ArrayBlockingQueueDemo arrayBlockingQueueDemo = new ArrayBlockingQueueDemo(
				10);
		Runnable producer = putItem(arrayBlockingQueueDemo);
		Runnable consumer = takeItem(arrayBlockingQueueDemo);
		new Thread(producer).start();
		new Thread(consumer).start();
	}

	private static Runnable takeItem(
			ArrayBlockingQueueDemo arrayBlockingQueueDemo)
	{
		Runnable consumer = () -> {
			while (true)
			{
				System.out
						.println("Consumer =" + arrayBlockingQueueDemo.take());
			}

		};
		return consumer;
	}

	private static Runnable putItem(
			ArrayBlockingQueueDemo arrayBlockingQueueDemo)
	{
		Runnable producer = () -> {

			while (i < 40)
			{
				System.out.println("Producer " + (++i));
				arrayBlockingQueueDemo.put(i);
			}

		};
		return producer;
	}
}
