package thread;
/*
 * This program can go for infinite loop
 */
public class WithoutVolatile
{
	boolean flag = true;
	Thread t1 = new Thread(new Runnable()
	{
		public void run()
		{
			System.out.println("Thread1");
		
			flag = false;

		}
	});
	Thread t2 = new Thread(new Runnable()
	{
		public void run()
		{
			while (flag)
			{
				System.out.println("Thread2");
			}
		}
	});

	public static void main(String[] args)
	{
		WithoutVolatile volatile1 = new WithoutVolatile();
		volatile1.t1.start();
		volatile1.t2.start();
	}
}
