package com.nik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*
 * longest even length word 
 */
public class MaximumNoOfEvenWord
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");

		findEventLengthWord(sc.nextLine());
		sc.close();
	}

	private static void findEventLengthWord(String str)
	{
		List<String> count = new ArrayList<String>();
		for (String s : str.split(" "))
		{
			if (s.length() % 2 == 0)
			{
				count.add(s);
			}
		}
		if (count.size() > 0)
		{
			Collections.sort(count, new StringLengthComparator());
			System.out.println(count.get(count.size() - 1));
		} else
		{
			System.out.println("there is no even words");
		}

	}
}

class StringLengthComparator implements Comparator<String>
{

	@Override
	public int compare(String s1, String s2)
	{
		return s1.length() - s2.length(); // compare length of Strings
	}
}
