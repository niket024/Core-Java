public class Use1 extends Use
{
	int accno1;
	int mob1;

	Use1(int i, int j)
	{
		super(i,j);
		accno1 = i;
		mob1 = j;
	}

	public static void main(String[] args)
	{
		//Use u2=new Use(10, 20);
		Use1 u1 = new Use1(10, 20);
		System.out.println("main");
	}

}
