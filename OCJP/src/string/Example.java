package string;

public class Example
{
	public static void main(String[] args)
	{
		String arr[] = { "aaa", "bbb", "ccc", "ddd" };
		String s1 = "";
		for (int i = 0; i < arr.length; i++)
		{
			s1 = s1 + arr[i] + " ,";
			// System.out.print(arr[i]+" ,");
		}
		System.out.println(s1);
		System.out.println(s1.replaceFirst(",$", ""));
		System.out.println(s1.substring(0, s1.length() - 1));
	}
}
