package ocjp;
class F
{
	int i;
	F(int i)
	{
		this.i=i;
	}
	//after overriding its checking the content
	@Override
	public boolean equals(Object obj)
	{
		F obj1=(F)obj;
		return this.i==obj1.i;
	}
}
public class Manager4
{
public static void main(String[] args)
{
	F f1=new F(5);
	F f2=new F(5);
	System.out.println(f1.equals(f2));
}
}
