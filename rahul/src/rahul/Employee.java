package rahul;

import java.util.LinkedList;
import java.util.List;

public class Employee
{

	public static void main(String[] args)
	{
		List<Integer> unique = new LinkedList<Integer>();
		int arr[] = { 1, 2, 3, 6, 8, 20, 16, 0, 10, 8, 13, 3 };
		for (int i = 0; i < arr.length; i++)
		{
			int x = arr[i];
			for (int j = i + 1; j < arr.length; j++)
			{
				int y = arr[j];

				if ((x + y) == 16 && j != i)
				{

					if (!(unique.contains(x) && unique.contains(y)))
					{
						System.out.println("x: " + x + " and y: " + y);
					}
					unique.add(x);
					unique.add(y);
				}
			}
		}

	}
}
