public class UnderScore
{
	public static void main(String[] args)
	{
		int oneMillion_ = 1_00_0_00_0;
//before jdk1.7 " _"(underscore) is not permitted in integer literal
		int oneMillion = 1000000;

		if (oneMillion_ == oneMillion)
		{

			System.out.println(true);

		} else
		{

			System.out.println(false);

		}
	}
}
