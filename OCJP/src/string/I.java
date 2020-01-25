package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class I
{
public static void main(String[] args)
{
	String src="123abc123abc123";
	String s="12";
	Pattern p1=Pattern.compile(s);
	Matcher m1=p1.matcher(src);
	while(m1.find())
	{
		System.out.println(m1.start()+":"+m1.group());
	}
			
}
}
