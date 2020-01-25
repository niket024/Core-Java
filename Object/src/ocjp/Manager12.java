package ocjp;
class W1
{
	int i;
	String s1;
	W1(int i,String s1)
	{
		this.i=i;
		this.s1=s1;
	}
	public int hashCode()
	{
		String str=Integer.toString(i);
		int hash=str.hashCode();
		hash+=s1.hashCode();
		return hash;
	}
}
public class Manager12
{
public static void main(String[] args)
{
	W1 w=new W1(12, "abc");
	W1 w1=new W1(12, "abc");
	System.out.println(w.hashCode());
	System.out.println(w.hashCode());
}
}
