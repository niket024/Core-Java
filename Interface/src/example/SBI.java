package example;

public class SBI extends RBI
{

	@Override
	public int getROI()
	{
		System.out.println("I m from SBi");
		return 7 * getFormula();
	}
	@Override
	void getBankDetails()
	{
		// TODO Auto-generated method stub
		
	}
}
