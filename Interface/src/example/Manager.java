package example;

public class Manager
{
	public static void main(String[] args)
	{
		SBI s1 = new SBI();
		System.out.println(s1.getROI());
		s1.getBankDetails();
		System.out.println("-----------------");
		HDFC hdfc = new HDFC();
		hdfc.getBankDetails();
		System.out.println(hdfc.getROI());
		
		System.out.println("-----------------");
		ICICI icici = new ICICI();
		System.out.println(icici.getROI());
		icici.getBankDetails();
		
	}
}