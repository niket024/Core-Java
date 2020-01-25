package set;

import java.util.Collections;
import java.util.TreeSet;

public class Manager6
{
public static void main(String[] args)
{
	TreeSet set=new TreeSet(Collections.reverseOrder());
	set.add(34);
	set.add(8);
	set.add(90);
	set.add(87);
	set.add(43);
	set.add(7);
	set.add(23);
	set.add(67);
	set.add(999);
	System.out.println(set);
}
}
