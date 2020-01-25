package com.nik.util;

import com.nik.model.Corridor;
import com.nik.model.Floor;

public class PowerCalculator
{
	public static int BULB_CAPACITY = 5;
	public static int AC_CAPACITY = 10;

	public static boolean isAcNeedToBeSwitchedOff(Floor floor)
	{
		return getTotalPowerLimitForFloor(floor) > getTotalPowerConsumedForFloor(floor);

	}

	private static Integer getTotalPowerConsumedForFloor(Floor floor)
	{
		int total = 0;
		for (Corridor corridor : floor.getMainCorridors())
		{
			total += (corridor.getBulbs().size() * 5)
					+ (corridor.getAcs().size() * 10);

		}
		for (Corridor corridor : floor.getSubCorridors())
		{
			total += (corridor.getBulbs().size() * 5)
					+ (corridor.getAcs().size() * 10);
			
		}
		return total;

	}

	private static Integer getTotalPowerLimitForFloor(Floor floor)
	{
		return (floor.getMainCorridors().size() * 15)
				+ (floor.getSubCorridors().size() * 10);
	}
}
