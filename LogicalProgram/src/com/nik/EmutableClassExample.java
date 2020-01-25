package com.nik;

import java.util.HashMap;
import java.util.Iterator;

public final class EmutableClassExample {

	private final int id;

	private final String name;

	private final HashMap<String, String> testMap;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	// Perform cloning of objects in the getter methods to return a copy rather
	// than returning the actual object reference
	@SuppressWarnings("unchecked")
	public HashMap<String, String> getTestMap() {
		return (HashMap<String, String>) testMap.clone();
	}

	// Initialize all the fields via a constructor performing deep copy.
	public EmutableClassExample(int i, String n, HashMap<String, String> hm)
	{
		System.out.println("Performing Deep  for Object initialization");
		this.id = i;
		this.name = n;
		HashMap<String, String> tempMap = new HashMap<String, String>();
		String key;
		Iterator<String> it = hm.keySet().iterator();
		while (it.hasNext())
		{
			key = it.next();
			tempMap.put(key, hm.get(key));
		}
		this.testMap = tempMap;
	}

	// Shallow copy

//	public EmutableClassExample(int id, String name, HashMap<String, String> testMap) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.testMap = testMap;
//	}

	public static void main(String[] args) {
		HashMap<String, String> h1 = new HashMap<String, String>();
		h1.put("1", "first");
		h1.put("2", "second");

		String s = "original";

		int i = 10;

		EmutableClassExample ce = new EmutableClassExample(i, s, h1);

		// Lets see whether its copy by field or reference
		System.out.println(s == ce.getName());
		System.out.println(h1 == ce.getTestMap());
		// print the ce values
		System.out.println("ce id:" + ce.getId());
		System.out.println("ce name:" + ce.getName());
		System.out.println("ce testMap:" + ce.getTestMap());
		// change the local variable values
		i = 20;
		s = "modified";
		h1.put("3", "third");
		// print the values again
		System.out.println("ce id after local variable change:" + ce.getId());
		System.out.println("ce name after local variable change:" + ce.getName());
		System.out.println("ce testMap after local variable change:" + ce.getTestMap());

		HashMap<String, String> hmTest = ce.getTestMap();
		hmTest.put("4", "new");

		System.out.println("ce testMap after changing variable from accessor methods:" + ce.getTestMap());

	}

}
