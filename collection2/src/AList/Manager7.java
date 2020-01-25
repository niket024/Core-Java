package AList;

import java.util.ArrayList;

public class Manager7 extends ArrayList
{
	public static void main(String[] args)
	{
		Manager7 list = new Manager7();
		list.add(12);
		list.add(56);
		list.add(77);
		list.add(99);
		list.add(76);
		list.add(55);
		list.add(43);
		System.out.println(list);
		System.out.println(list);
		list.removeRange(2, 4);// protected method
		System.out.println(list);
	}
}
