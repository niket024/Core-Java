package com.nik;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

/* John wants to travel for his/her friends home
 * He can travel (1, 2, 3, 4, 5) per hours
 * Help John to find the minimum hours to be spent to reach to destination
 */public class TravellProblem
{
	public static void main(String[] args)
	{
		List<Integer> hours = Arrays.asList(1, 2, 3, 4, 5);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the distance");
		int dist = sc.nextInt();
		Map<Integer, Integer> mapHours = new TreeMap<Integer, Integer>();
		int flag = 0;
		if (hours.contains(dist))
		{
			System.out.println("Time will be taken in hours: " + 1);
			return;
		}

		else
		{
			for (Integer i : hours)
			{

				if (i != 1)
				{
					if (dist % 5 == 0)
					{
						flag = i;
					} else
					{
						mapHours.put((dist / i), i);
					}
				}
			}
		}
		if (flag > 0)
		{
			System.out.println(dist / flag);
		} else
		{
			Entry<Integer, Integer> entry = mapHours.entrySet().iterator()
					.next();
			System.out.println(entry.getKey() + 1);
		}
		sc.close();
	}
}
