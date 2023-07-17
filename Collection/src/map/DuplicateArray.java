package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DuplicateArray {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(4);
		list.add(6);
		list.add(6);
		System.out.println(list);
		// 2=3, 3=1, 4=2, 6=2
		Map<Integer, Integer> result = getDuplicateCounts(list);
		System.out.println(result);

	}

	private static Map<Integer, Integer> getDuplicateCounts(ArrayList<Integer> list) {
		Map<Integer, Integer> result = new HashMap<>();
		for (Integer i : list) {
			if (result.containsKey(i)) {
				int count = result.get(i);
				result.put(i, count + 1);
			} else {
				result.put(i, 1);
			}
		}
		return result;
	}

}
