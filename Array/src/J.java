
public class J
{
public static void main(String[] args)
{
	int x[]=new int[2];
	int y[]=new int[3];

	System.out.println(x.length);
	System.out.println(y.length);
	x=y;
	System.out.println(x.length);
	System.out.println(y.length);
	y=x;
	System.out.println(x.length);
	System.out.println(y.length);
}
}
