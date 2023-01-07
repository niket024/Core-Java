package com.lara;
//Inter thread communication
class Shared1
{
	synchronized void test1()
	{
		System.out.println("test1-begin");
		try
		{
			wait();
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("test1-end");
	}

	synchronized void test2()
	{
		notifyAll();
	}
}

class Thread1 extends Thread
{
	Shared1 s1;

	Thread1(Shared1 s1)
	{
		this.s1 = s1;

	}

	public void run()
	{
		s1.test1();
	}
}

class Thread2 extends Thread
{
	Shared1 s1;

	Thread2(Shared1 s1)
	{
		this.s1 = s1;

	}

	public void run()
	{
		s1.test1();
	}
}

public class Manager4
{
	public static void main(String[] args)
	{

		Shared1 s1 = new Shared1();
		Thread1 t1 = new Thread1(s1);
		t1.start();
		Thread2 t2 = new Thread2(s1);
		t2.start();
		try
		{
			Thread.sleep(20000);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		s1.test2();
		s1.test2();
	}
}