package map;

import java.util.LinkedHashMap;

public class D
{
public static void main(String[] args)
{
	LinkedHashMap map= new LinkedHashMap();
	map.put("k1", "v1");
	map.put("k5", "v5");
	map.put("k2", "v2");
	map.put("k3", "v3");
	map.put("k4", "v4");

	System.out.println(map);
}
}
