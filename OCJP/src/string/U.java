package string;

import java.util.StringTokenizer;

public class U
{
	public static void main(String[] args)
	{
		String str1 = "this is string split by string tokenizer created by niket";
		StringTokenizer st = new StringTokenizer(str1);// if we not pass pattern
														// then by default it
														// will split by white
														// space
		System.out.println("--splited by white space--");
		System.out.println(st.countTokens());
		while (st.hasMoreElements())
		{
			System.out.println(st.nextElement());
		}
		String str2 = "this,is,string split by,string tokenizer, created by niket";
		StringTokenizer str = new StringTokenizer(str2, ",");
		System.out.println("--splited by comma--");
		while (str.hasMoreElements())
		{
			System.out.println(str.nextElement());
		}
		System.out.println(Float.isNaN(11));;
	}
}
