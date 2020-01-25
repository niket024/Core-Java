package set;

import java.util.HashSet;

class G
{
	int i, j;

	G(int i, int j)
	{
		this.i = i;
		this.j = j;
	}

	public int hashCode()
	{
		System.out.println("hashcode");
		String s1 = Integer.toString(i);
		String s2 = Integer.toString(j);
		int i = s1.hashCode();
		i = i + s2.hashCode();
		
		System.out.println(i);
		return i;
	}

	public boolean equals(Object obj)
	{
		System.out.println("equals");
		return (this.i == ((G) obj).i && this.j == ((G) obj).j);
	}
}

public class Manager3
{
	public static void main(String... args)
	{
		HashSet set = new HashSet();
		set.add(new G(1, 1));
		//new G(2,3).equals(new G(3,4));
		set.add(new G(2, 1));
		set.add(new G(1, 1));

		set.add(new G(1, 2));

		System.out.println(set.size());
	}
}
