package comparable;

import java.util.Arrays;

class A implements Comparable
{
	int i;

	A(int i)
	{
		this.i = i;
	}

	@Override
	public String toString()
	{
		return "i=" + i;
	}
	@Override
	public int compareTo(Object o)
	{
		A a1=(A)o;
		return this.i-a1.i;
	}
}

public class Manager1
{
public static void main(String[] args)
{
	A[]x={
			new A(23),
			new A(4),
			new A(7),
			new A(89),
			new A(6),
			new A(98)
	};
	System.out.println(Arrays.toString(x));
	Arrays.sort(x);
	System.out.println(Arrays.toString(x));
}
}
