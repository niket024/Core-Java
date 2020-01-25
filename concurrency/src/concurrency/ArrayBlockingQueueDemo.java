package concurrency;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ArrayBlockingQueueDemo
{
	ReentrantLock lock = new ReentrantLock();
	Condition full = lock.newCondition();
	Condition empty = lock.newCondition();
	static int i = 0;
	int max;
	LinkedList<Integer> item;

	public ArrayBlockingQueueDemo(int max)
	{
		super();
		this.max = max;
		this.item = new LinkedList<Integer>();
	}

	public void put(Integer i)
	{
		lock.lock();
		try
		{
			if (item.size() == max)
			{
				try
				{
					full.await();
				} catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			item.add(i);
			empty.signalAll();
		} finally
		{
			lock.unlock();
		}

	}

	public int take()
	{
		lock.lock();
		try
		{
			if (item.size() == 0)
			{
				try
				{
					empty.await();
				} catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			full.signalAll();
			return item.remove();

		} finally
		{
			lock.unlock();
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
