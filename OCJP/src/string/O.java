package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class O
{
public static void main(String[] args)
{
	
	String s1="abcxyz1pq2hgsd3kkk59ytzw";
	
	Pattern p1=Pattern.compile("[a-p]");

	Matcher m1=p1.matcher(s1);
	while(m1.find())
	{
		System.out.println(m1.start()+":"+m1.group());
	}
	
}
}
