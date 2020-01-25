package string;


public class S
{
public static void main(String[] args)
{
	String s1="abvc2hg4jj5";
	String s2[]=s1.split("[0-4]");
	for(String s3:s2)
	{
		System.out.println(s3);
	}
	String s4[]=s1.split("[a-p]");
	for(String s5:s4)
	{
		System.out.println(s5);
	}
}
}
