package example.vehicle;

public class FourWheeler implements Vehicle
{

	@Override
	public int getSpeed()
	{
		return 400;
	}

	@Override
	public int getCost()
	{
		return 1000000;
	}

}
