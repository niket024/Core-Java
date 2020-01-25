package pack1;

public class AA
{
public static void main(String[] args)
{
	String s1="anfdrty";
	String s2="";
	System.out.println(s1.equalsIgnoreCase(s2));
	System.out.println(s1.codePointAt(0));
	System.out.println(s1.codePointCount(0, 3));
	System.out.println(s1.contains("i"));
	System.out.println(s1.endsWith("l"));
	System.out.println(s1.intern());
	System.out.println(s2.isEmpty());
	char c[]=new char[3];
	c[0]='a';
	c[1]='a';
	c[2]='a';
	System.out.println(s1.copyValueOf(c));
	System.out.println(s1);
	
}
}
