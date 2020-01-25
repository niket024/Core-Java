package ocjp;

class V
{
	int i, j;

	V(int i, int j)
	{
		this.i = i;
		this.j = j;
	}

	@Override
	public String toString()
	{

		return "i=" + i+",j="+j;
	}

	@Override
	public boolean equals(Object obj)
	{

		return (obj instanceof V && i == ((V) obj).i);
	}

	@Override
	public int hashCode()
	{
		String s1 = Integer.toString(i);
		String s2 = Integer.toString(j);
		int hash = s1.hashCode();
		hash += s2.hashCode();
		return hash;

	}
}

public class Manager11
{
	public static void main(String[] args)
	{
		V v1 = new V(10, 40);
		V v2 = new V(40, 10);
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v1.equals(v2));
		System.out.println(v1.hashCode());
		System.out.println(v2.hashCode());
	}
}
