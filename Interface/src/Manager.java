import java.util.Scanner;

public class Manager
{
	public static void getVehicleDetails(Vehicle v)
	{
		v.cost();
		v.speed();
	}

	public static void getVehicleDetails(String type)
	{
		if (type.equals("TwoWheeler"))
		{
			System.out.println("***********two wheeler details*********");

			TwoWheeler t1 = new TwoWheeler();
			t1.cost();
			t1.speed();
		} else if (type.equals("FourWheeler"))
		{
			System.out
					.println("**************FourWheeler Details**************");

			FourWheeler f1 = new FourWheeler();
			f1.cost();
			f1.speed();
		}
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the type of vehicle");
		String type = sc.next();

		getVehicleDetails(type);
		sc.close();

	}
}
