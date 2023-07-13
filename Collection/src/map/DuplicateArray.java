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
		// 2=3, 3=1, 4=2, 6=2
		Map<Integer, Integer> duplicateCount = getDuplicateCount(list);
		System.out.println(duplicateCount);
	}

	private static Map<Integer, Integer> getDuplicateCount(ArrayList<Integer> list) {
		Map<Integer, Integer> result = new HashMap<>();
		for (int i = 0; i < list.size(); i++) {
			int data = list.get(i);
			if (result.containsKey(data)) {
				int count = result.get(data);
				result.put(data, count + 1);
			} else {
				result.put(data, 1);
			}
		}

		return result;
	}

}
