package set;

import java.util.HashSet;
import java.util.Iterator;

public class A1
{
	public static void main(String[] args)
	{
		HashSet set = new HashSet();
		System.out.println(set.add(12));
		System.out.println(set.add("abc"));
		System.out.println(set.add(56.90));
		System.out.println(set.add(12));
		System.out.println(set.add("12"));
		System.out.println(set.add("xyz"));
		System.out.println(set);
		Iterator it = set.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
