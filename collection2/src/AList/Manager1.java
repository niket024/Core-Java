package AList;

import java.util.ArrayList;

public class Manager1
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add(23);
		list.add("ancv");
		list.add(23.89);
		list.add(238);
		list.add(true);
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i)+" value");
		}
		System.out.println("-----------------");

		for (Object obj : list)
		{
			System.out.println(obj);
		}
		System.out.println(list);
	}
}
