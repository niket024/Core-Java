public class F
{
	public static void main(String[] args)
	{
		final int i=90;
		class G
		{
			void test()
			{
				//i=78;
				System.out.println(i);
			}
		}
		G g1= new G();
		g1.test();
	}
}
