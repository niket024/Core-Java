package string;

public class InternExample
{
public static void main(String[] args)
{
	String s1="abc";
	String s2="abc";
	String s3=new String("abc").intern();//it will push string from non constant to constant pool
	System.out.println(s1==s2);
	System.out.println(s1==s3);
}
}
