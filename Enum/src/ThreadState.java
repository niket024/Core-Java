public class ThreadState
{
	public static void main(String[] args)
	{
		Thread.State state[] = Thread.State.values();
		for (Thread.State s1 : state)
		{
			System.out.println(s1);
		}
	}
}
