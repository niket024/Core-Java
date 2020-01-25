import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class C
{
	private Lock l1 = new ReentrantLock();

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

class Thread1 extends Thread
{
	C c1;

	Thread1(C c1)
	{
		this.c1 = c1;
	}

	@Override
	public void run()
	{
		c1.test1();
	}
}

class Thread2 extends Thread
{
	C c1;

	Thread2(C c1)
	{
		this.c1 = c1;
	}

	@Override
	public void run()
	{
		c1.test1();
	}
}

public class Manager
{
	public static void main(String[] args)
	{
		C c1 = new C();
		Thread1 t1 = new Thread1(c1);
		t1.start();
		Thread2 t2 = new Thread2(c1);

		t2.start();

	}

}
