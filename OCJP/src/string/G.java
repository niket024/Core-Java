package string;

public class G
{
public static void main(String[] args)
{
	
	System.out.printf("---->%10d",12);
	System.out.printf("%-10d<---",1000);
	System.out.println("");
	System.out.printf("%2$10s----%1$20d",100,"abc");
	System.out.println("");
	System.out.printf("(%2$-10s----(%1$015d)",1000,"abc");
	System.out.println();
	System.out.printf("(%+d)",100);
	System.out.println();
	System.out.printf("[%0(10d]",-23456);
	System.out.println();
	System.out.printf("%,d",2345627);
	System.out.println();
	System.out.printf("%.2f",2345689.9077);
	
	
	
}
}
