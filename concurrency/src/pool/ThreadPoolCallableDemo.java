package pool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class WorkerThread implements Callable<Integer>
{
	private int message;

	public WorkerThread(int message)
	{
		this.message = message;
	}

	@Override
	public Integer call() throws Exception
	{
		System.out.println(Thread.currentThread().getName() + " started: "
				+ message);
		processMesages(message);
		System.out.println(Thread.currentThread().getName() + " finished: "
				+ message);
		return message;
	}

	private int processMesages(int message2)
	{
		return ++message2;

	}
}

public class ThreadPoolCallableDemo
{
	public static void main(String[] args)
	{
		int nThreads = Runtime.getRuntime().availableProcessors();
		ExecutorService threadPool = Executors.newFixedThreadPool(nThreads);
		// ExecutorService threadPool = Executors.newCachedThreadPool();
		// ExecutorService threadPool =
		// Executors.newScheduledThreadPool(nThreads);
		// ExecutorService threadPool = Executors.newSingleThreadExecutor();
		// ExecutorService threadPool = Executors.newCachedThreadPool();

		Future<Integer> future = null;
		List<Future<Integer>> taskList = new ArrayList<Future<Integer>>();
		for (int i = 1; i <= nThreads; i++)
		{
			future = threadPool.submit(new WorkerThread(i));
			taskList.add(future);
		}

		threadPool.shutdown();
		while (!threadPool.isTerminated())
		{

		}
		System.out.println("All thread finishes the task... See the order");
		for (Future<Integer> future2 : taskList)
		{
			try
			{
				System.out.println(future2.get());
			} catch (InterruptedException | ExecutionException e)
			{
				e.printStackTrace();
			}
		}

	}
}
