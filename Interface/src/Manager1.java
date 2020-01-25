public class Manager1
{
	
	static void callMethod(Vehicle v1)
	{
		v1.cost();
		v1.speed();
	}

	public static void main(String[] args)
	{
		
		System.out.println("two wheeler");
		
		callMethod(new TwoWheeler());
		System.out.println("--------------");
		System.out.println("four wheeler");
		
		callMethod(new FourWheeler());

	}
}

