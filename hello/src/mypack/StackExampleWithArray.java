package mypack;

import java.util.ArrayList;
import java.util.List;

public class StackExampleWithArray
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		String inpValue = "2 3 11 7 + 5 - 3 * + -";
		String[] ary = inpValue.split(" "); // getting the input in string array
		List<Integer> list = new ArrayList<Integer>(); // created empty integer
														// list

		for (int i = 0; i < ary.length; i++)
		{
			if (isNumber(ary[i]))
			{ // checking if the value is number type
				list.add(Integer.parseInt(ary[i])); // / when number add to list
			} else
			{
				int pos = list.size(); // get the position of last element in
										// list
				if ((ary[i]).equals("+"))
				{ // check type of operator
					Integer sum = list.get(pos - 1) + list.get(pos - 2); // perform
																			// operation
					list.remove(pos - 1); // remove the last element
					list.remove(pos - 2); // remove last but one
					list.add(sum); // add back the sum/result to list

				} else if ((ary[i]).equals("-"))
				{
					int sub = 0;
					if (list.get(pos - 1) > list.get(pos - 2))
					{
						sub = list.get(pos - 1) - list.get(pos - 2);
					} else
					{
						sub = list.get(pos - 2) - list.get(pos - 1);
					}

					list.remove(pos - 1);
					list.remove(pos - 2);
					list.add(sub);

				} else
				{

					int mult = list.get(pos - 1) * list.get(pos - 2);
					list.remove(pos - 1);
					list.remove(pos - 2);
					list.add(mult);

				}

			}
		}
		System.out.println(list.get(0));// printing the final result

	}

	/** Method to check if the element is number type */
	static boolean isNumber(String s)
	{
		for (int i = 0; i < s.length(); i++)
			if (Character.isDigit(s.charAt(i)) == false)
				return false;

		return true;
	}

}
