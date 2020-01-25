package concurrency;

import java.util.concurrent.ArrayBlockingQueue;

public class ProduceConsumer
{
	static int i = 0;

	public static void main(String[] args)
	{
		ArrayBlockingQueue<Integer> item = new ArrayBlockingQueue<>(10);

		Runnable producer = () -> {

			while (i < 20)
			{
				try
				{
					System.out.println("Producer " + (++i));
					item.put(i);
				} catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}

		};
		Runnable consumer = () -> {
			while (true)
			{
				try
				{
					System.out.println("Consumer =" + item.take());
				} catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}

		};
		new Thread(producer).start();
		new Thread(consumer).start();
	}
}
