package example.vehicle;

public class TwoWheeler implements Vehicle
{

	@Override
	public int getSpeed()
	{
		return 200;
	}

	@Override
	public int getCost()
	{
		return 100000;
	}

}
