package ocjp;
class U1
{
	int i;
	U1(int i)
	{
		this.i=i;
	}
	@Override
	public String toString()
	{
		
		return "i="+i;
	}
	@Override
	public boolean equals(Object obj)
	{
		return (obj instanceof U1 && i==((U1)obj).i);
	}
	@Override
	public int hashCode()
	{
		return i;
	}
}
public class Manager10
{
public static void main(String[] args)
{
	U1 u1=new U1(90);
	U1 u2=new U1(90);
	System.out.println(u1);
	System.out.println(u2);
	System.out.println(u1.equals(u2));
	System.out.println(u2.hashCode());
	System.out.println(u2.hashCode());
}
}
