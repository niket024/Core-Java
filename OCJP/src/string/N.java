package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class N
{
public static void main(String[] args)
{
	int count =0;
	String s1="abcxyz15pq2hgsd3kkk59";
	
	//Pattern p1=Pattern.compile("[1-9]");
	Pattern p1=Pattern.compile("\\d");
	String pattern ="[AZ[a-z](a-z)";
	try{
        Pattern.compile(pattern);
        System.out.println("Valid");
      } catch(Exception ex){
        System.out.println("Invalid");
      }

	Matcher m1=p1.matcher(s1);
	while(m1.find())
	{
		count++;
	}
	System.out.println("no of digit  are:"+count);
}
}
