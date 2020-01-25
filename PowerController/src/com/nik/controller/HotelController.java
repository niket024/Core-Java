package com.nik.controller;

import java.util.Map;

import com.nik.model.Floor;

public class HotelController
{
	public static void controlFloors(Controller controller)
	{
		controller.control();
	}

	public void controlHotel(Map<String, Floor> floors, String movementOnfloor,
			String movementOnSubCorridor)
	{
		Controller controller = null;
		// Maintain default state

		if (movementOnfloor.isEmpty() && movementOnSubCorridor.isEmpty())
		{
			controlDefaultState(floors, true);
		} else if (movementOnfloor.equals("1")
				&& movementOnSubCorridor.equals("2"))
		{
			controlDefaultState(floors, false);
			controller = new ControlSubCorridor2Movement(floors,
					movementOnfloor);
			HotelController.controlFloors(controller);
		} else if (movementOnfloor.equals("1")
				&& movementOnSubCorridor.equals("1"))
		{
			controlDefaultState(floors, false);
			controller = new ControlSubCorridor1Movement(floors,
					movementOnfloor);
			HotelController.controlFloors(controller);
		} else if (movementOnfloor.equals("2")
				&& movementOnSubCorridor.equals("2"))
		{
			controlDefaultState(floors, false);
			controller = new ControlSubCorridor2Movement(floors,
					movementOnfloor);
			HotelController.controlFloors(controller);
		} else if (movementOnfloor.equals("2")
				&& movementOnSubCorridor.equals("1"))
		{
			controlDefaultState(floors, false);
			controller = new ControlSubCorridor1Movement(floors,
					movementOnfloor);
			HotelController.controlFloors(controller);
		}

	}

	private void controlDefaultState(Map<String, Floor> floors, boolean needToPrint)
	{
		Controller controller;
		controller = new ControlDefaultState(floors, needToPrint);
		HotelController.controlFloors(controller);
	}
}
