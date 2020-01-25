package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class H
{
public static void main(String[] args)
{
	String src="abcabaabbabcac";
	String exp="ab";
	Pattern p1=Pattern.compile(exp);
	Matcher m1=p1.matcher(src);
	while(m1.find())
	{
		System.out.println(m1.start()+":"+m1.group());
	}
}
}
