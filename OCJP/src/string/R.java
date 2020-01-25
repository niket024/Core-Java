package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class R
{
public static void main(String[] args)
{
	String s1="abvc234hg4jj5";
	Pattern p1=Pattern.compile(s1.substring(0,6));
	Matcher m1=p1.matcher(s1);
	while(m1.find())
	{
		System.out.println(m1.start()+":"+m1.group());
	}
}
}
