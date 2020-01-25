package ocjp;

class G
{
	int i;

	G(int i)
	{
		this.i = i;
	}

	@Override
	public String toString()
	{

		return "i=" + i;
	}
}

class H
{
	G g1;
	int j;

	public H(G g1, int j)
	{
		this.g1 = g1;
		this.j = j;
	}

	@Override
	public String toString()
	{

		return g1 + ",j=" + j;
	}
}

public class Manager
{
	public static void main(String[] args)
	{
		G g1 = new G(89);
		H h1 = new H(g1, 20);
		System.out.println(g1);
		System.out.println(h1);
	}
}
