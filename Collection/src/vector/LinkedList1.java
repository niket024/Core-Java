package vector;

import java.util.LinkedList;

public class LinkedList1
{
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		list.add(123);
		list.add(56);
		list.add(90);
		list.add(87);
		list.add(45);
		list.add(13);
		list.add(56);

		System.out.println(list);
		System.out.println(list.poll());
		System.out.println(list);

		System.out.println(list.peek());
		System.out.println(list);
	}
}
