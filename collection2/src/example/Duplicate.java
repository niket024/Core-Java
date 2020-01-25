package example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Duplicate
{
	static Map<Integer, Integer> duplicate = new HashMap<Integer, Integer>();

	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(4);
		list.add(1);
		list.add(0);
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(4);
		list.add(1);
		list.add(0);
		getDuplicateCount(list);
		System.out.println(duplicate);
	}

	private static void getDuplicateCount(List<Integer> list)
	{
		for (Integer value : list)
		{
			if (duplicate.get(value) == null)
			{
				duplicate.put(value, 1);
			} 
			else
			{
				Integer count = duplicate.get(value);
				duplicate.put(value, count + 1);
			}
		}

	}
}
