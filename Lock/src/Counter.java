//this program is to show how lock() and unlock() method is working
class Lock
{

	private boolean isLocked = false;

	public synchronized void lock() 
	{
		try
		{
		while (isLocked)
		{
			wait();
		}
		isLocked = true;
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}

	public synchronized void unlock()
	{
		isLocked = false;
		notify();
	}
}

class C1
{
	Lock l1 = new Lock();

	void test1() 
	{

		l1.lock();
		System.out.println("test1-begin");

		System.out.println("test1-end");
		l1.unlock();// this method is used to release the lock which is with
					// by 1st thread so that another
					// thead will execute if we will not calling the unlock()
					// method then another thread will not execute.its just work
					// like notify() method
	}

}

class Thread3 extends Thread
{
	C1 c1;

	Thread3(C1 c1)
	{
		this.c1 = c1;
	}

	@Override
	public void run()
	{
		c1.test1();
	}
}

class Thread4 extends Thread
{
	C1 c1;

	Thread4(C1 c1)
	{
		this.c1 = c1;
	}

	@Override
	public void run()
	{
		c1.test1();
	}
}

public class Counter
{
	public static void main(String[] args)
	{
		C1 c1 = new C1();
		Thread3 t1 = new Thread3(c1);
		t1.start();
		Thread4 t2 = new Thread4(c1);

		t2.start();

	}

}
