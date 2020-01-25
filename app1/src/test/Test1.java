package test;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test1
{
	public static void main(String[] args)
	{
		String s1 = "adndjdyecmkk";

		Map<String, Integer> dupliacte = new LinkedHashMap<String, Integer>();
		for (int i = 0; i < s1.length(); i++)
		{
			if (dupliacte.containsKey(s1.charAt(i) + ""))
			{
				int count = dupliacte.get(s1.charAt(i) + "");
				dupliacte.put(s1.charAt(i) + "", ++count);
			} else
			{
				dupliacte.put(s1.charAt(i) + "", 1);
			}
		}
		System.out.println(dupliacte);

	}
}
