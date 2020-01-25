package string;

import java.util.Arrays;
import java.util.StringTokenizer;

public class T
{
	public static void main(String[] args)
	{
		StringTokenizer st = new StringTokenizer("a;b;c;d;123;abc", ";");
		while (st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		System.out.println("---------------------");
		/*
		 * while(st.hasMoreElements()) { System.out.println(st.nextElement()); }
		 */
	}
}
