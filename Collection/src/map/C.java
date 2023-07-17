package map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class C
{
	public static void main(String[] args)
	{
		/*
		 * TreeMap map = new TreeMap(); map.put(12, "abc"); map.put(12, "aaa");
		 * map.put(45, "xyz"); map.put(78, 56); map.put(6, true); map.put(0,
		 * null); map.put(1, "123");
		 */
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		map.put(12, 222);
		map.put(12, 777);
		map.put(45, 0);
		map.put(78, 56);
		map.put(6, 554);
		map.put(0, 77);
		map.put(1, 11);
		System.out.println(map);

		Set<Integer> keys = map.keySet();
		System.out.println(keys);
		System.out.println(map.values());

		Iterator<Integer> it = keys.iterator();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while (it.hasNext())
		{
			list.add(map.get(it.next()));
		}
		Collections.sort(list);
		System.out.println(list);

	}
}
