package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DuplicateArray
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(4);
		list.add(6);
		list.add(6);
		Map<Integer, Integer> duplateMap = findDuplicate(list);
		System.out.println(duplateMap);
	}

	private static Map<Integer, Integer> findDuplicate(ArrayList<Integer> list)
	{
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (Integer i1 : list)
		{
			if (map.containsKey(i1))
			{
				int oldValue = map.get(i1);
				map.put(i1, ++oldValue);
			} else
			{
				map.put(i1, 1);
			}
		}

		return map;
	}
}
