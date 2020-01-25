package example.vehicle;

import java.util.Scanner;

public class Manager
{
	static void getVehicleDetails(Vehicle v, String vehicleType)
	{
		System.out.println(vehicleType + " wheeler cost = " + v.getCost());
		System.out.println(vehicleType + " wheeler speed = " + v.getSpeed()
				+ " kmph");
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("*********Vehicle details******");
		System.out.println("1.Two wheeler");
		System.out.println("2.Four wheeler");
		System.out.println("Enter your choice(1-2)");
		int ch = sc.nextInt();
		System.out.println("Here is the details:");
		System.out.println("----------------------");
		if (ch == 1)
		{
			TwoWheeler twoWheeler = new TwoWheeler();

			getVehicleDetails(twoWheeler, "two");
		} else if (ch == 2)
		{
			FourWheeler fourWheeler = new FourWheeler();

			getVehicleDetails(fourWheeler, "four");
		} else
		{
			System.out.println("Wrong choice");
		}
	/*	System.out.println("Enter your name");
		String name = sc.next();
		System.out.println("Your name is " + name);*/
	}
}
