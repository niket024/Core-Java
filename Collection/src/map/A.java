package map;

import java.util.HashMap;

public class A
{
public static void main(String[] args)
{

	HashMap map=new HashMap();
	map.put("k1", 123);
	map.put("k2", "abc");
	map.put("k5", "xyz");
	map.put("k4", 67.90);
	
	map.put("k1", 67.78);
	map.put(123, 123);
	map.put(null, null);
	map.put(67.90, true);

	System.out.println(map);
	System.out.println(map.get("k2"));
}
}
