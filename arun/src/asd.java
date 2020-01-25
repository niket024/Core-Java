
public class asd
{
	static int test1(int i)
	{
		return(i++);
		
	}
 static int test2(int i)
 {
	 return(++i);
	 
 }
public static void main(String[] args)
{
int i=0;
int j=test1(i++)+test2(++i)+i++ + i--+test1(i--)+test2(i++);
System.out.println(i);
System.out.println(j);
}


}

