package com.nik.controller;

import java.util.Map;
import java.util.Map.Entry;

import com.nik.model.Ac;
import com.nik.model.Bulb;
import com.nik.model.Corridor;
import com.nik.model.Floor;

public class CommonMethods
{
	//This method is just to display later we can remove this
		public static void displayState(Map<String, Floor> floors)
		{
			for (Entry<String, Floor> entry:floors.entrySet())
			{
				Floor floor = entry.getValue();
				printMainCorridorStatus(floor);
				printSubcorridorStatus(floor);
			}

		}

		private static void printSubcorridorStatus(Floor floor)
		{
			for (Corridor corridor : floor.getSubCorridors())
			{
				for (Bulb bulb : corridor.getBulbs())
				{
					System.out.print(corridor.getCorridorType() + " Light 1 : "
							+ bulb.getBulbStatus());
				}
				for (Ac ac : corridor.getAcs())
				{
					System.out.println(" AC  : " + ac.getAcStatus());
				}
			}
		}

		private static void printMainCorridorStatus(Floor floor)
		{
			System.out.println("           " + floor.getFloorName()
					+ "            ");
			for (Corridor corridor : floor.getMainCorridors())
			{
				for (Bulb bulb : corridor.getBulbs())
				{
					System.out.print(corridor.getCorridorType() + " Light 1 : "
							+ bulb.getBulbStatus());
				}
				for (Ac ac : corridor.getAcs())
				{
					System.out.println(" AC  : " + ac.getAcStatus());
				}
			}
		}
}
