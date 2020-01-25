package vector;

import java.util.LinkedList;

public class Manager2
{
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		list.add(" ");
		list.add(23);
		list.add(21);
		list.add(45);
		list.add(67);
		list.add(87);
		list.add(23);
		list.add(43);
		list.add(223);
		list.add(" ");
		System.out.println(list);
		Object obj = list.removeFirst();
		System.out.println(obj);
		Object obj1 = list.removeLast();
		System.out.println(obj1);
		System.out.println(list);
	}
}
