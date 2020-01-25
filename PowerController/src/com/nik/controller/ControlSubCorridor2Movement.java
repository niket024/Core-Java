package com.nik.controller;

import java.util.Map;

import com.nik.model.Ac;
import com.nik.model.Bulb;
import com.nik.model.Corridor;
import com.nik.model.Floor;
import com.nik.util.Constants;

public class ControlSubCorridor2Movement implements Controller
{
	private Map<String, Floor> floors;
	private String floorName;

	public ControlSubCorridor2Movement(Map<String, Floor> floors,
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
				for (Ac ac : corridor.getAcs())
				{
					ac.setAcStatus(Constants.OFF);
				}
			} else
			{
				for (Bulb bulb : corridor.getBulbs())
				{
					bulb.setBulbStatus(Constants.ON);
				}
			}
		}
		CommonMethods.displayState(floors);
	}
}
