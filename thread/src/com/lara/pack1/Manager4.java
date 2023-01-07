package com.lara.pack1;
class C extends Thread
{
	public synchronized void run()
	{
		System.out.println("begin");
		try
		{
			wait();
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("end");
	}
}
public class Manager4
{
 public static void main(String[] args)
{
	C c1=new C();
	c1.start();
	try
	{
		Thread.sleep(5000);
	}
	catch(InterruptedException ex)
	{
		ex.printStackTrace();
	}
	System.out.println(c1.getState());
	synchronized (c1)
	{
	c1.notify();	
	}
}
}
