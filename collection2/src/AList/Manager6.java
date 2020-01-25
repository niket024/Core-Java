package AList;

import java.util.ArrayList;

public class Manager6
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add(12);
		list.add(56);
		list.add(77);
		list.add(99);
		list.add(76);
		list.add(55);
		list.add(43);
		ArrayList list1 = new ArrayList();
		list1.add(12);
		list1.add(5);
		list1.add(98);
		list1.add(11);
		System.out.println(list);
		System.out.println(list1);
		System.out.println("------------------");
		//list1.removeAll(list);
		list1.retainAll(list);
		System.out.println(list);
		System.out.println(list1);
		
	}
}
