package set;

import java.util.HashSet;

public class A
{
	public static void main(String[] args)
	{
		HashSet set = new HashSet();
		set.add(null);
		set.add(null);
		set.add(45);
		set.add(12);
		set.add("abc");
		set.add(true);
		set.add(23.90);
		set.add(12);
		System.out.println(set);
	}
}
