
public class G implements Runnable
{
	@Override
	public void run()
	{
		for(int i=0; i<2000;i++)
		{
			System.out.println(i);
		}

	}
	public static void main(String[] args)
	{
		G g1 = new G();
		Thread t1 = new Thread(g1);
		t1.start();
		for(int i=2000; i<4000;i++)
		{
			System.out.println(i);
		}

	}
}
