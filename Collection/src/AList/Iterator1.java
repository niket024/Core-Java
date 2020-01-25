package AList;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(123);
		list.add(34);
		list.add(66);
		list.add(77);
		list.add(88);
		list.add(99);
		list.add(65);
		list.add(778);
		System.out.println(list);

		Iterator<Integer> it = list.iterator();

		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
}
