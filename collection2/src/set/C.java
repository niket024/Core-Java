package set;

import java.util.LinkedHashSet;

public class C
{
	public static void main(String[] args)
	{
		LinkedHashSet set = new LinkedHashSet();
		set.add(123);
		set.add(35);
		set.add("abc");
		set.add(55);
		set.add(88);
		set.add(99);
		set.add(33);
		set.add(33);
		set.add(33);
		set.add(33);
		set.add(11);
		System.out.println(set);
	}
}
