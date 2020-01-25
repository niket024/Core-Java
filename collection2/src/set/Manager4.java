package set;

import java.util.HashSet;
import java.util.TreeSet;

public class Manager4
{
public static void main(String[] args)
{
	HashSet set=new HashSet();
	set.add(12);
	set.add(45);
	set.add(77);
	set.add(888);
	set.add(99);
	set.add(12);
	System.out.println(set);
	TreeSet set1=new TreeSet(set);
	System.out.println(set1);
	
}
}
