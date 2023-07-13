package com.nik.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByValue {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "froyo");
		map.put(2, "abby");
		map.put(3, "denver");
		map.put(4, "frost");
		map.put(11, "zzzz");
		map.put(5, "daisy");
		map.put(55, "daisy");
		map.put(6, "mmm");
		System.out.println(sortHashMapByValues((HashMap<Integer, String>)map.clone()));
		sortByValueJava8(map);

	}


	private static void sortByValueJava8(HashMap<Integer, String> map) {
		Map<Integer, String> newMap = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e1, LinkedHashMap::new));
		newMap.forEach((k, v) -> System.out.println(k + ":" + v));

	}

	public static LinkedHashMap<Integer, String> sortHashMapByValues(HashMap<Integer, String> passedMap) {
		List<Integer> mapKeys = new ArrayList<>(passedMap.keySet());
		List<String> mapValues = new ArrayList<>(passedMap.values());
		Collections.sort(mapValues);
		Collections.sort(mapKeys);

		LinkedHashMap<Integer, String> sortedMap = new LinkedHashMap<>();

		for(String s: mapValues) {
			for(Integer i: mapKeys) {
				String s1 = passedMap.get(i);
				if(s.equals(s1)) {
					passedMap.remove(i);
					sortedMap.put(i, s);
					break;
				}
			}
		}
		//other way
//		Iterator<String> valueIt = mapValues.iterator();
//		while (valueIt.hasNext()) {
//			String val = valueIt.next();
//			Iterator<Integer> keyIt = mapKeys.iterator();
//
//			while (keyIt.hasNext()) {
//				Integer key = keyIt.next();
//				String comp1 = passedMap.get(key);
//				String comp2 = val;
//
//				if (comp1.equals(comp2)) {
//					keyIt.remove();
//					sortedMap.put(key, val);
//					break;
//				}
//			}
//		}
		return sortedMap;
	}
}
