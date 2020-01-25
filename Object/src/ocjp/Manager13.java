package ocjp;

class Z
{
	int i, j;

	Z(int i, int j)
	{
		this.i = i;
		this.j = j;
	}

	@Override
	public String toString()
	{
		return "i=" + i + ",j="+j;
	}

	@Override
	public boolean equals(Object obj)
	{

		return (obj instanceof Z && i == ((Z) obj).i && j == ((Z) obj).j);
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

public class Manager13
{
	public static void main(String[] args)
	{
		Z z1 = new Z(9, 20);
		Z z2 = new Z(20, 9);
		System.out.println(z1);
		System.out.println(z2);
		System.out.println(z1.equals(z2));
		System.out.println(z1.hashCode());
		System.out.println(z2.hashCode());
	}
}
