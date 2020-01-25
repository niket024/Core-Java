package priority;

public class Manager
{
	public static void main(String[] args)
	{
		A a1 = new A();
		a1.setPriority(Thread.MIN_PRIORITY);
		a1.start();
		B b1 = new B();
		b1.setPriority(Thread.MAX_PRIORITY);
		b1.start();
	}
}
