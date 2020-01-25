import java.util.Scanner;

public class Rev1
{
	public static void main(String[] args)
	{
		
	
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the string:");
		String s1 = sc.next();
		int count=s1.length()-1;

		char reve[]=new char[count+1];
		for(int i=0;i<s1.length();i++,count--)
		{
			reve[count]=s1.charAt(i);
		}
		String s2=new String(reve);
	
		System.out.println(s2);
		
		
	}
}
