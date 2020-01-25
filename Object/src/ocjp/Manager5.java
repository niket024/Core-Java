package ocjp;
class H1
{
	int i;
	double d;
	H1(int i,double d)
	{
		this.i=i;
		this.d=d;
	}
	@Override
	public String toString()
	{


		return "i="+i+",d="+d;
	}
	@Override
	public boolean equals(Object obj)
	{
		
		H1 obj1=(H1)obj;
		boolean flag=(obj1.i==i && d==obj1.d);
		return flag;
	}
}
public class Manager5
{
public static void main(String[] args)
{
	H1 h1=new H1(4, 34.89);
	H1 h2=new H1(4, 34.89);
	System.out.println(h1);
	System.out.println(h2);
	System.out.println(h1.equals(h2));
}
}
