package map;

import java.util.TreeMap;

public class C
{
public static void main(String[] args)
{
	TreeMap map =new TreeMap();
	map.put(12, "abc");
	map.put(12, "aaa");
	map.put(45, "xyz");
	map.put(78,56);
	map.put(6, true);
	map.put(0, null);
	map.put(1, "123");
	System.out.println(map);
}
}
