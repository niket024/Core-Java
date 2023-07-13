package example.vehicle;

public class Manager1 {
	public static void main(String[] args) {

		System.out.println("Two wheeler details");
		TwoWheeler twoWheeler = new TwoWheeler();
		System.out.println(twoWheeler.getCost());
		System.out.println(twoWheeler.getSpeed());
		FourWheeler fourWheeler = new FourWheeler();
		System.out.println("Four wheeler details");

		System.out.println(fourWheeler.getCost());
		System.out.println(fourWheeler.getSpeed());
	}
}
