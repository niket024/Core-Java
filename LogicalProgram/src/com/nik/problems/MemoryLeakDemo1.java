package com.nik.problems;

import java.util.ArrayList;
import java.util.List;

public class MemoryLeakDemo1
{
	public static List<Double> list = new ArrayList<>();

	public void populateList()
	{
		for (double i = 0; ; i++)
		{
			list.add(i);
		}
	}

	public static void main(String[] args)
	{
		System.out.println("Memory leak");
		new MemoryLeakDemo1().populateList();
	}
}
