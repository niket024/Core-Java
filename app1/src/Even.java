public class Even
{
	public static void main(String[] args)
	{
		int sume=0,sumo=0;
		for (int i = 1; i <= 200; i++)
		{
			if (i % 2 == 0)
			{
				sume=sume+i;
			} else
			{
				sumo=sumo+i;
			}
		}
		System.out.println("sum of even no is:"+sume);
		System.out.println("sum of odd no is:"+sumo);
	}
}
