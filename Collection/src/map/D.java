package map;

import java.util.LinkedHashMap;

public class D
{
	public static void main(String[] args)
	{
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		map.put("k1", 999);
		map.put("k2", 222);
		map.put("k3", 333);
		map.put("k4", 444);
		map.put("k5", 555);
		map.put("k6", 666);
		map.put("k7", 777);
		System.out.println(map);
	}
}
