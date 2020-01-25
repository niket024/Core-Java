package com.nik.controller;

import java.util.Map;

import com.nik.model.Ac;
import com.nik.model.Bulb;
import com.nik.model.Corridor;
import com.nik.model.Floor;
import com.nik.util.Constants;
import com.nik.util.PowerCalculator;

public class ControlSubCorridor1Movement implements Controller
{
	private Map<String, Floor> floors;
	private String floorName;

	public ControlSubCorridor1Movement(Map<String, Floor> floors,
			String floorName)
	{
		super();
		this.floors = floors;
		this.floorName = floorName;
	}

	@Override
	public void control()
	{
		Floor floor = floors.get(floorName);
		for (Corridor corridor : floor.getSubCorridors())
		{
			if (corridor.getCorridorType().equals("Sub corridor 1"))
			{
				for (Bulb bulb : corridor.getBulbs())
				{
					bulb.setBulbStatus(Constants.ON);
				}
				for (Ac ac : corridor.getAcs())
				{
					if (PowerCalculator.isAcNeedToBeSwitchedOff(floor))
					{
						ac.setAcStatus(Constants.OFF);
					} else
					{
						ac.setAcStatus(Constants.ON);
					}
				}
			} else
			{
				for (Bulb bulb : corridor.getBulbs())
				{
					bulb.setBulbStatus(Constants.OFF);
				}
			}
		}
		CommonMethods.displayState(floors);

	}
}
