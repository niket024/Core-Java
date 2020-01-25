package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class L
{
public static void main(String[] args)
{
	String s1="abc";
	String s2="abci";
	
	Pattern p1=Pattern.compile(s1);
	Matcher m1=p1.matcher(s2);
	if(m1.find())
	{
		System.out.println("first string contains second string");
	}
	else
	{
		System.out.println("first string doesn't contains second string");
	}
}
}
