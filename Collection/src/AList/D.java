package AList;

import java.util.ArrayList;

public class D
{
	public static void main(String[] args)
	{
		boolean status = false;
		ArrayList list = new ArrayList();
		list.add(1213);
		list.add(23);
		list.add(45);
		list.add(67);
		list.add(54);
		list.add(54);
		list.add(789);
		
		System.out.println(list);
		Integer i1 = null;
		for (int i = 0; i < list.size(); i++)
		{
			i1 =  (Integer) list.get(i);
			if (i1 == 67)
			{
				status = true;
				break;

			}

		}
		if (status)
		{
			System.out.println("this data is available");
		} else
		{
			System.out.println("no data ");
		}
	}
}
