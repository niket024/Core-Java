package com.lara.pack1;
class G extends Thread
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
public class Manager7
{
 public static void main(String[] args)
{
	
	 G g1=new G();
	 g1.start();
	 try
	 {
		 Thread.sleep(1000);
	 }
	 catch(InterruptedException ex)
	 {
		 ex.printStackTrace();
	 }
	 g1.stop();
	 try
	 {
		 Thread.sleep(1000);
	 }
	 catch(InterruptedException ex)
	 {
		 ex.printStackTrace();
	 }
	 System.out.println(g1.getState());
}
}

	
