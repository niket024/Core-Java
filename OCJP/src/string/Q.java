package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q
{
public static void main(String[] args)
{
	
	String s1="ab cxy z1p$7gsd3,kkkb 59y/tzw";
	
	//Pattern p1=Pattern.compile("\\s");//white space
//	Pattern p1=Pattern.compile("\\D");//accept digit
	Pattern p1=Pattern.compile("\\W+");//special character
//	Pattern p1=Pattern.compile("\\d+");//no in series
	//Pattern p1=Pattern.compile("\\d");//number
	//Pattern p1=Pattern.compile("\\w");//number and character

	Matcher m1=p1.matcher(s1);
	while(m1.find())
	{
		System.out.println(m1.start()+":"+m1.group());
	}
	
}
}
