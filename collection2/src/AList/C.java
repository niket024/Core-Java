package AList;

import java.util.ArrayList;

public class C
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add(1213);
		list.add("abc");
		list.add(45.90);
		list.add(67);
		list.add(54);
		list.add(789);

		// list.remove(3);
		// list.add(3,23);
		// list.set(3, 69);
		// System.out.println(list.get(3));
		// list.clear();
		
		System.out.println(list.contains(67));
		System.out.println(list.size());
		System.out.println(list);
	}
}
