package AList;

import java.util.ArrayList;

public class E
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		E e1 = new E();
		int i = 78;
		Integer i1 = 89;
		list.add(1213);
		list.add("abc");
		list.add(45.90);
		list.add(67);
		list.add(54);
		list.add(789);
		list.add(i);
		list.add(i1);
		list.add(e1);

		System.out.println(list.size());
		System.out.println(list);
		list.set(3, "niket");

		System.out.println(list);
	}
}
