package com.lara.pack1;
class B extends Thread
{
	public void run()
	{
		System.out.println("begin");
		try
		{
			Thread.sleep(10000);
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("end");
	}
}
public class Manager3
{
 public static void main(String[] args)
{
	B b1=new B();
	b1.start();
	try
	{
		Thread.sleep(5000);
	}
	catch(InterruptedException ex)
	{
		ex.printStackTrace();
	}
	System.out.println(b1.getState());
}
}
