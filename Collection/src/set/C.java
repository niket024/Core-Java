package set;

import java.util.LinkedHashSet;

public class C
{
	public static void main(String[] args)
	{
		LinkedHashSet set=new LinkedHashSet();
		System.out.println(set.add(12));
		set.add(45);
		System.out.println(set.add(12));
		set.add("abc");
		set.add(true);
		set.add(23.90);
		set.add(12);
		System.out.println(set);
	}
}
