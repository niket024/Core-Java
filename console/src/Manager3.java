import java.io.Console;


public class Manager3
{
public static void main(String[] args)
{
	System.out.println(1);
	Console c1=System.console();
	System.out.println(c1);
	System.out.println(2);
	// char ch[]=c1.readPassword();
	 System.out.println(c1.readPassword().toString());
}
}
