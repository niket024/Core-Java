package AList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Manager8
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
	System.out.println(list);
	System.out.println(Collections.max(list));
	System.out.println(Collections.min(list));
	Comparator ctr=Collections.reverseOrder();
	Collections.sort(list,ctr);
	System.out.println(list);
}
}
