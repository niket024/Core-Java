package pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Worker implements Runnable
{
	private int message;

	public Worker(int i)
	{
		this.message = i;
	}

	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName() + " started: "
				+ message);
		processMesages();
		System.out.println(Thread.currentThread().getName() + " finished: "
				+ message);

	}

	private void processMesages()
	{
		try
		{
			Thread.sleep(1000);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}

	}
}

public class ThreadPoolDemo1
{
	public static void main(String[] args)
	{
		int nThreads = Runtime
				.getRuntime().availableProcessors();
		ExecutorService threadPool = Executors.newFixedThreadPool(nThreads);
		for (int i = 0; i < nThreads; i++)
		{
			threadPool.execute(new Worker(i));
		}
		threadPool.shutdown();
		while (!threadPool.isTerminated())
		{

		}
		System.out.println("All thread finishes the task");
	}
}
