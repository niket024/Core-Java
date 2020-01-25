package com.nik.factory;

import java.util.List;

import com.nik.model.Ac;
import com.nik.model.Bulb;
import com.nik.model.Corridor;
import com.nik.model.Floor;

public class DesignHotel
{
	public Bulb getBulb(String bulbStatus, int bulbsUnits)
	{
		return new Bulb(bulbStatus, bulbsUnits);
	}

	public Ac getAc(String acStatus, int acUnits)
	{
		return new Ac(acStatus, acUnits);
	}

	public Corridor createCorridor(List<Bulb> bulbs, List<Ac> acs,
			String corridorType)
	{
		return new Corridor(bulbs, acs, corridorType);
	}

	public Floor createFloor(String floorName, List<Corridor> mainCorridors,
			List<Corridor> subCorridors)
	{
		return new Floor(floorName, mainCorridors, subCorridors);
	}

}
