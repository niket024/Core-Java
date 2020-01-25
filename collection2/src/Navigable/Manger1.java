package Navigable;

import java.util.TreeMap;

public class Manger1
{
public static void main(String[] args)
{
	TreeMap map= new TreeMap();
	map.put(90, "abx");
	map.put(56, "hhh");
	map.put(6, "jjj");
	map.put(91, "kkk");
	map.put(34, "lll");
	map.put(23, "ppp");
	System.out.println(map);
	System.out.println(map.ceilingKey(45));
	System.out.println(map.floorKey(23));
	System.out.println(map.headMap(34));
	System.out.println(map.tailMap(34));
	System.out.println(map.higherKey(56));
}
}
