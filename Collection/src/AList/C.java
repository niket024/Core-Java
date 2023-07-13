package AList;

import java.util.ArrayList;

public class C {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1213);
		list.add("abc");
		list.add(45.90);
		list.add(67);
		list.add(54);
		list.add(789);

		System.out.println(list);
		//list.clear();
		System.out.println(list.remove(3));
		System.out.println(list.size());
		System.out.println(list.contains(67));
		System.out.println(list.isEmpty());
		System.out.println(list);
//
		System.out.println(list.set(3, "aaa"));
		list.add(2, 55);
		System.out.println(list);

	}
}
