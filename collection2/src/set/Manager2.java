package set;

import java.util.HashSet;

class E
{
	int i;

	E(int i)
	{
		this.i = i;
	}

	@Override
	public String toString()
	{

		return "" + i;
	}

	public int hashCode()
	{
		System.out.println("hash");
		return Integer.toString(i).hashCode();
	}

	public boolean equals(Object obj)
	{
		System.out.println("eql");
		E e1 = (E) obj;
		return this.i == e1.i;
	}
}
//(2,3)=100
//(3,2)=100

public class Manager2
{
	public static void main(String[] args)
	{

		HashSet set4 = new HashSet();
		set4.add(new E(34));//123
		System.out.println("--------------");
		set4.add(new E(34));//123
		System.out.println("----------------");
		set4.add(new E(45));//200
		System.out.println("-------------------");
		set4.add(new E(34));//123
		
		// System.out.println("main");
		System.out.println(set4);
	}
}
