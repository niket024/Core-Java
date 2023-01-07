package example;

public class SBI extends RBI {

	@Override
	public int getROI() {
		System.out.println("I m from SBi");
		return 7 * getFormula();
	}

	@Override
	void getBankDetails() {
		System.out.println("I am SBI bank");

	}
}
