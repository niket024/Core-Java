package example;

public class HDFC extends RBI
{

	@Override
	public int getROI()
	{
		System.out.println("I m from HDFC");
		return 8*getFormula();
	}
	@Override
	void getBankDetails()
	{
		// TODO Auto-generated method stub
		
	}
}
