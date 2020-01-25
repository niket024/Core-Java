package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class K
{
public static void main(String[] args)
{
	String s1="abcabaabcaba";
	//Pattern p1=Pattern.compile("[ab]");
	//Pattern p1=Pattern.compile("ab");
	Pattern p1=Pattern.compile("(ab)");
	Matcher m1=p1.matcher(s1);
	while(m1.find())
	{
		System.out.println(m1.start()+":"+m1.group());
	}
}
}
