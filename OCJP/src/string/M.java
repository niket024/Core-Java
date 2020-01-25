package string;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M
{
public static void main(String[] args)
{
	int count =0;
	String s1="abc 123 sd nik abcd";
	System.out.println(s1);
	System.out.println(Arrays.toString(s1.split(" ")));
	Pattern p1=Pattern.compile(" ");

	Matcher m1=p1.matcher(s1);
	while(m1.find())
	{
		
		count++;
	}
	System.out.println("no of white spaces are:"+count);
}
}
