package com.nik.nosql;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.json.JSONException;
import org.json.JSONObject;

public class NoSqlManager {
	private Map<String, Map<String, Entry>> store = new HashMap<String, Map<String, Entry>>();
	private Map<String, Set<String>> indexes = new HashMap<String, Set<String>>();

	public static void main(String[] args) {
		String input = "{\r\n" + 
				"   \"delhi\":{\r\n" + 
				"      \"lat\":-6.0,\r\n" + 
				"      \"pollution\":\"high\"\r\n" + 
				"   },\r\n" + 
				"   \"kolcata\":{\r\n" + 
				"      \"lat\":\"-6.0\",\r\n" + 
				"      \"aaa\":\"high\",\r\n" + 
				"      \"bbb\":89,\r\n" + 
				"      \"cc\":true\r\n" + 
				"   }\r\n" + 
				"}";
		NoSqlManager manager = new NoSqlManager();
		manager.putInStore(input);
		System.out.println(manager.store);
		System.out.println(manager.indexes);
		//printing
		manager.fetchRecord("delhi").forEach((k, v) -> {
			System.out.println(k + "=" + v);
		});
	}

	private void putInStore(String input) {
		try {
			JSONObject keys = new JSONObject(input);
			Iterator<String> it = keys.keys();
			while (it.hasNext()) {
				saveOrUpdateEntry(keys, it);
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}

	private void saveOrUpdateEntry(JSONObject keys, Iterator<String> it) throws JSONException {
		String rootKey = it.next();
		JSONObject jsonObject = (JSONObject) keys.get(rootKey);
		Iterator<String> it1 = jsonObject.keys();
		while (it1.hasNext()) {
			saveEntry(rootKey, jsonObject, it1);
		}
	}

	private void saveEntry(String rootKey, JSONObject jsonObject, Iterator<String> it1) throws JSONException {
		String attribute = it1.next();
		Object val = jsonObject.get(attribute);
		pudateIndex(attribute, rootKey);
		if (store.containsKey(rootKey)) {
			updateEntry(rootKey, jsonObject, attribute, val);

		} else {
			prepareEntryObject(rootKey, jsonObject, attribute, val);
		}
	}

	private void updateEntry(String rootKey, JSONObject jsonObject, String attribute, Object val) throws JSONException {
		Map<String, Entry> map = store.get(rootKey);
		if (map.containsKey(attribute)) {
			updateEntry(rootKey, attribute, val, map);
		} else {
			prepareEntryObject(rootKey, jsonObject, attribute, val);
		}
	}

	private void updateEntry(String rootKey, String attribute, Object val, Map<String, Entry> map) {
		Entry entry = map.get(attribute);
		//TODO: cloning of object logic need to be better
		Class<Entry> entryClass = (Class<Entry>) entry.getClass();
		try {
			Entry dupEntry = entryClass.newInstance();
			dupEntry.setKey(attribute);
			dupEntry.setValue(val);
			map.put(attribute, dupEntry);
			store.put(rootKey, map);
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	private void pudateIndex(String attribute, String rootKey) {
		if (indexes.containsKey(attribute)) {
			Set<String> set = indexes.get(attribute);
			set.add(rootKey);
		} else {
			Set<String> set = new HashSet<String>();
			set.add(rootKey);
			indexes.put(attribute, set);
		}

	}

	public Map<String, Entry> fetchRecord(String key) {
		return store.get(key);
	}

	public Map<String, Entry> deleteRecord(String key) {
		// TODO: update index
		return store.remove(key);
	}

	private void prepareEntryObject(String rootKey, JSONObject jsonObject, String attribute, Object val)
			throws JSONException {
		String type = findDataType(jsonObject.get(attribute));
		if (type.equals("String")) {
			prepareStringEntry(rootKey, attribute, val);
		} else if (type.equals("Integer")) {
			prepareIntegerEntry(rootKey, attribute, val);
			
		} else if (type.equals("Double")) {
			prepareDoubleEntry(rootKey, attribute, val);
		} else if (type.equals("Boolean")) {
			prepareBooleanEntry(rootKey, attribute, val);
		}
	}

	private void prepareBooleanEntry(String rootKey, String attribute, Object val) {
		Entry<String, Boolean> entry = new Entry<String, Boolean>(attribute, Boolean.parseBoolean(val.toString()));
		if (store.containsKey(rootKey)) {
			Map<String, Entry> entries = store.get(rootKey);
			entries.put(attribute, entry);
			store.put(rootKey, entries);
		} else {
			Map<String, Entry> entries = new HashMap<String, Entry>();
			entries.put(attribute, entry);
			store.put(rootKey, entries);
		}
	}

	private void prepareDoubleEntry(String rootKey, String attribute, Object val) {
		Entry<String, Double> entry = new Entry<String, Double>(attribute, Double.parseDouble(val.toString()));
		if (store.containsKey(rootKey)) {
			Map<String, Entry> entries = store.get(rootKey);
			entries.put(attribute, entry);
			store.put(rootKey, entries);
		} else {
			Map<String, Entry> entries = new HashMap<String, Entry>();
			entries.put(attribute, entry);
			store.put(rootKey, entries);
		}
	}

	private void prepareIntegerEntry(String rootKey, String attribute, Object val) {
		Entry<String, Integer> entry = new Entry<String, Integer>(attribute, Integer.parseInt(val.toString()));
		if (store.containsKey(rootKey)) {
			Map<String, Entry> entries = store.get(rootKey);
			entries.put(attribute, entry);
			store.put(rootKey, entries);
		} else {
			Map<String, Entry> entries = new HashMap<String, Entry>();
			entries.put(attribute, entry);
			store.put(rootKey, entries);
		}
	}

	private void prepareStringEntry(String rootKey, String attribute, Object val) {
		Entry<String, String> entry = new Entry<String, String>(attribute, val.toString());
		if (store.containsKey(rootKey)) {
			Map<String, Entry> entries = store.get(rootKey);
			entries.put(attribute, entry);
			store.put(rootKey, entries);
		} else {
			Map<String, Entry> entries = new HashMap<String, Entry>();
			entries.put(attribute, entry);
			store.put(rootKey, entries);
		}
	}

	private static String findDataType(Object object) {
		if (object instanceof String) {
			System.out.println("String: " + object);
			return "String";
		} else if (object instanceof Integer) {
			System.out.println("Integer: " + object);
			return "Integer";
		} else if (object instanceof Double) {
			System.out.println("Double: " + object);
			return "Double";
		} else if (object instanceof Boolean) {
			System.out.println("Boolean: " + object);
			return "Boolean";
		} else {
			throw new RuntimeException("Undefined data type");
		}

	}
}
