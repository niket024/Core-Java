package test;

import java.util.ArrayList;
import java.util.List;

public class Test
{
	public static void main(String[] args)
	{
		String input[] = { "dog", "cat", "apple", "apricot", "fish" };
		getSortestForm(input);
	}

	private static void getSortestForm(String[] input)
	{
		List<String> list = new ArrayList<String>();
		String s = "";
		boolean flag = false;
		for (int i = 0; i < input.length; i++)
		{
			for (int j = i + 1; j < input.length; j++)
			{
				if (input[j].startsWith(input[i].charAt(0) + ""))
				{
					flag = true;
					//break;
				}
			}
			if (flag)
			{
				flag=false;
			} else
			{
				list.add(input[i].charAt(0) + "");
			}

		}
		System.out.println(list);

	}
}
