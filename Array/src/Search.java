public class Search
{
	public static void main(String[] args)
	{
		// Linear search
		// 1,2,3,4,5,6,7,8
		boolean flag = false;
		int count = 0;
		int y[] = { 12, 34, 45, 67, '@', 44, 33, 45, 45 };
		for (int i : y)
		{
			if (i == 45)
			{
				count++;
				flag = true;
				// break;
			}
		}
		if (flag)
		{
			System.out.println("available=" + count);

		} else
		{
			System.out.println("not available");

		}

	}
}
