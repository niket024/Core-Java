package Navigable;

import java.util.TreeSet;

public class Manager
{
public static void main(String[] args)
{
	TreeSet set1=new TreeSet();
	set1.add(50);
	set1.add(23);
	set1.add(67);
	set1.add(7);
	set1.add(75);
	set1.add(15);
	set1.add(34);
	set1.add(5);
	set1.add(22);
	System.out.println(set1);
	System.out.println(set1.ceiling(15));
	System.out.println(set1.floor(13));
	System.out.println(set1.headSet(23));
	System.out.println(set1.tailSet(15));
	System.out.println(set1.tailSet(15,false));
	System.out.println(set1.higher(15));
}

}
