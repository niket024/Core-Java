public class Mix
{
	static
	{
		System.out.println("sib");
	}
	{
		System.out.println("iib");
	}

	Mix()
	{
		System.out.println("cons");
	}

	public static void main(String[] args)
	{
		Mix m1 = new Mix();
		Mix m2 = new Mix();
		System.out.println("main");
	}
}
