package com.nik.controller;

import java.util.Map;
import java.util.Map.Entry;

import com.nik.model.Ac;
import com.nik.model.Bulb;
import com.nik.model.Corridor;
import com.nik.model.Floor;
import com.nik.util.Constants;
import com.nik.util.PowerCalculator;

public class ControlDefaultState implements Controller
{
	Map<String, Floor> floors;
	boolean needToPrint;

	public ControlDefaultState(Map<String, Floor> floors, boolean needToPrint)
	{
		super();
		this.floors = floors;
		this.needToPrint = needToPrint;
	}

	@Override
	public void control()
	{
		for (Entry<String, Floor> entry : floors.entrySet())
		{
			Floor floor = entry.getValue();
			controlMaincorridors(floor);
			controlSubcorridors(floor);
		}
		if (needToPrint)
			CommonMethods.displayState(floors);
	}

	private void controlSubcorridors(Floor floor)
	{
		for (Corridor corridor : floor.getSubCorridors())
		{
			for (Bulb bulb : corridor.getBulbs())
			{
				bulb.setBulbStatus(Constants.OFF);
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
		}
	}

	private void controlMaincorridors(Floor floor)
	{
		for (Corridor corridor : floor.getMainCorridors())
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
		}
	}

}
