package polyMorphism.realtime;

public class Manager {

	public static void getVehicleDetails(Vehicle vehicle) {
		System.out.println("Cost = " + vehicle.getCost());
		System.out.println("Speed = " + vehicle.getSpeed());
	}

	public static void main(String[] args) {
			
		TwoWheeler twoWheeler = new TwoWheeler();
		getVehicleDetails(twoWheeler);
		System.out.println("-------------");
		FourWheeler fourWheeler = new FourWheeler();
		getVehicleDetails(fourWheeler);
		System.out.println("---------------");
		ThreeWheeler threeWheeler = new ThreeWheeler();
		getVehicleDetails(threeWheeler);
	}
}
