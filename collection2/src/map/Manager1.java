package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Manager1
{
	public static void main(String[] args)
	{
		HashMap map = new HashMap();
		map.put("k1", "v1");
		map.put("k2", "v2");
		map.put("k3", "v3");
		map.put("key", "value");
		map.put("k4", "v4");
		map.put("k5", "v5");
		map.put("k6", "v6");
		System.out.println(map);
		Set set = map.keySet();
		Iterator it = set.iterator();
		Object key, value;
		while (it.hasNext())
		{
			key = it.next();
			value = map.get(key);
			System.out.println(key + ":" + value);
		}

	}
}
