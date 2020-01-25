package com.nik.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.BeforeClass;
import org.junit.Test;

import com.nik.controller.HotelController;
import com.nik.model.Ac;
import com.nik.model.Bulb;
import com.nik.model.Corridor;
import com.nik.model.Floor;
import com.nik.util.Constants;

public class TestHotelCnntroller
{
	static Map<String, Floor> floors;

	@BeforeClass
	public static void setUp()
	{
		// prepare data for floor 1
		List<Bulb> floor1MainCorridorsBulbs = new ArrayList<Bulb>();
		floor1MainCorridorsBulbs.add(new Bulb(Constants.OFF, 5));

		List<Ac> floor1MainCorridorsAcs = new ArrayList<Ac>();
		floor1MainCorridorsAcs.add(new Ac(Constants.ON, 10));

		List<Bulb> floor1SubCorridors1Bulbs = new ArrayList<Bulb>();
		floor1SubCorridors1Bulbs.add(new Bulb(Constants.OFF, 5));

		List<Ac> floor1SubCorridors1Acs = new ArrayList<Ac>();
		floor1SubCorridors1Acs.add(new Ac(Constants.ON, 10));

		List<Bulb> floor1SubCorridors2Bulbs = new ArrayList<Bulb>();
		floor1SubCorridors2Bulbs.add(new Bulb(Constants.OFF, 5));

		List<Ac> floor1SubCorridors2Acs = new ArrayList<Ac>();
		floor1SubCorridors2Acs.add(new Ac(Constants.ON, 10));

		// prepare data for floor 2
		List<Bulb> floor2MainCorridorsBulbs = new ArrayList<Bulb>();
		floor2MainCorridorsBulbs.add(new Bulb(Constants.OFF, 5));

		List<Ac> floor2MainCorridorsAcs = new ArrayList<Ac>();
		floor2MainCorridorsAcs.add(new Ac(Constants.ON, 10));

		List<Bulb> floor2SubCorridors1Bulbs = new ArrayList<Bulb>();
		floor2SubCorridors1Bulbs.add(new Bulb(Constants.OFF, 5));

		List<Ac> floor2SubCorridors1Acs = new ArrayList<Ac>();
		floor2SubCorridors1Acs.add(new Ac(Constants.ON, 10));

		List<Bulb> floor2SubCorridors2Bulbs = new ArrayList<Bulb>();
		floor2SubCorridors2Bulbs.add(new Bulb(Constants.OFF, 5));

		List<Ac> floor2SubCorridors2Acs = new ArrayList<Ac>();
		floor2SubCorridors2Acs.add(new Ac(Constants.ON, 10));

		List<Corridor> floor1MainCorridors = new ArrayList<Corridor>();
		List<Corridor> floor2MainCorridors = new ArrayList<Corridor>();
		floor1MainCorridors.add(new Corridor(floor1MainCorridorsBulbs,
				floor1MainCorridorsAcs, "Main corridor 1"));
		floor2MainCorridors.add(new Corridor(floor2MainCorridorsBulbs,
				floor2MainCorridorsAcs, "Main corridor 1"));

		List<Corridor> floor1SubCorridors = new ArrayList<Corridor>();
		floor1SubCorridors.add(new Corridor(floor1SubCorridors1Bulbs,
				floor1SubCorridors1Acs, "Sub corridor 1"));
		floor1SubCorridors.add(new Corridor(floor1SubCorridors2Bulbs,
				floor2SubCorridors2Acs, "Sub corridor 2"));
		List<Corridor> floor2SubCorridors = new ArrayList<Corridor>();
		floor2SubCorridors.add(new Corridor(floor2SubCorridors1Bulbs,
				floor2SubCorridors1Acs, "Sub corridor 1"));
		floor2SubCorridors.add(new Corridor(floor2SubCorridors2Bulbs,
				floor2SubCorridors2Acs, "Sub corridor 2"));
		floors = new HashMap<String, Floor>();
		floors.put("1", new Floor("Floor 1", floor1MainCorridors,
				floor1SubCorridors));
		floors.put("2", new Floor("Floor 2", floor2MainCorridors,
				floor2SubCorridors));
	}

	@Test
	public void testDefaultState()
	{
		System.out.println("*********Default state*********");
		HotelController controller = new HotelController();
		controller.controlHotel(floors, "", "");
		assertEquals(Constants.ON, floors.get("1").getMainCorridors().get(0).getBulbs().get(0).getBulbStatus());
		assertEquals(Constants.ON, floors.get("1").getMainCorridors().get(0).getAcs().get(0).getAcStatus());
		assertEquals(Constants.ON, floors.get("2").getMainCorridors().get(0).getBulbs().get(0).getBulbStatus());
		assertEquals(Constants.ON, floors.get("2").getMainCorridors().get(0).getAcs().get(0).getAcStatus());
	}

	@Test
	public void testMovementOnFloor1SubCorridor1()
	{
		System.out.println("*********Movement in Floor 1, Subcorridor 1*********");

		HotelController controller = new HotelController();
		controller.controlHotel(floors, "1", "1");
	}
	@Test
	public void testMovementOnFloor2SubCorridor1()
	{
		System.out.println("*********Movement in Floor 2, Subcorridor 1*********");
		
		HotelController controller = new HotelController();
		controller.controlHotel(floors, "2", "1");
	}

	@Test
	public void testMovementOnFloor1SubCorridor2()
	{
		System.out.println("*********Movement in Floor 1, Subcorridor 2*********");

		HotelController controller = new HotelController();
		controller.controlHotel(floors, "1", "2");
	}
	@Test
	public void testMovementOnFloor2SubCorridor2()
	{
		System.out.println("*********Movement in Floor 2, Subcorridor 2*********");
		
		HotelController controller = new HotelController();
		controller.controlHotel(floors, "2", "2");
	}


	@Test
	public void testNoMovementOnFloor1SubCorridor1For1Mint()
	{
		System.out.println("*********No movement in Floor 1,Sub corridor 1 for a minute*********");
		HotelController controller = new HotelController();
		controller.controlHotel(floors, "", "");
		assertEquals(Constants.ON, floors.get("1").getMainCorridors().get(0).getBulbs().get(0).getBulbStatus());
		assertEquals(Constants.ON, floors.get("1").getMainCorridors().get(0).getAcs().get(0).getAcStatus());
		assertEquals(Constants.ON, floors.get("2").getMainCorridors().get(0).getBulbs().get(0).getBulbStatus());
		assertEquals(Constants.ON, floors.get("2").getMainCorridors().get(0).getAcs().get(0).getAcStatus());
	}

	@Test
	public void testNoMovementOnFloor1SubCorridor2For1Mint()
	{
		System.out.println("*********No movement in Floor 1,Sub corridor 2 for a minute*********");
		HotelController controller = new HotelController();
		controller.controlHotel(floors, "", "");
		assertEquals(Constants.ON, floors.get("1").getMainCorridors().get(0).getBulbs().get(0).getBulbStatus());
		assertEquals(Constants.ON, floors.get("1").getMainCorridors().get(0).getAcs().get(0).getAcStatus());
		assertEquals(Constants.ON, floors.get("2").getMainCorridors().get(0).getBulbs().get(0).getBulbStatus());
		assertEquals(Constants.ON, floors.get("2").getMainCorridors().get(0).getAcs().get(0).getAcStatus());
	}
	@Test
	public void testPowerConsumptionOnFirstFloor()
	{
		System.out.println("*********Test power consumption on floor 1*********");
		floors.get("1").getMainCorridors().get(0).getAcs().get(0).setAcUnits(1088);
		floors.get("1").getMainCorridors().get(0).getBulbs().get(0).setBulbsUnits(5000);
		HotelController controller = new HotelController();
		controller.controlHotel(floors, "", "");
		assertEquals(Constants.ON, floors.get("1").getMainCorridors().get(0).getBulbs().get(0).getBulbStatus());
		assertEquals(Constants.OFF, floors.get("1").getMainCorridors().get(0).getAcs().get(0).getAcStatus());
		assertEquals(Constants.ON, floors.get("2").getMainCorridors().get(0).getBulbs().get(0).getBulbStatus());
		assertEquals(Constants.OFF, floors.get("2").getMainCorridors().get(0).getAcs().get(0).getAcStatus());
	}

}
/*List<Bulb> floor1MainCorridorsBulbs1 = new ArrayList<Bulb>();
floor1MainCorridorsBulbs1.add(new Bulb(Constants.OFF, 500));

List<Ac> floor1MainCorridorsAcs1 = new ArrayList<Ac>();
floor1MainCorridorsAcs1.add(new Ac(Constants.ON, 1000));

List<Bulb> floor1SubCorridors1Bulbs1 = new ArrayList<Bulb>();
floor1SubCorridors1Bulbs1.add(new Bulb(Constants.OFF, 5));

List<Ac> floor1SubCorridors1Acs1 = new ArrayList<Ac>();
floor1SubCorridors1Acs1.add(new Ac(Constants.ON, 10));
List<Corridor> floor1MainCorridors1 = new ArrayList<Corridor>();

floor1MainCorridors1.add(new Corridor(floor1MainCorridorsBulbs1,
		floor1MainCorridorsAcs1, "Main corridor 1"));
List<Corridor> floor1SubCorridors1 = new ArrayList<Corridor>();
Map<String, Floor> floors1 = new HashMap<String, Floor>();

floors1.put("1", new Floor("Floor 1", floor1MainCorridors1,
		floor1SubCorridors1));
HotelController controller = new HotelController();
controller.controlHotel(floors1, "", "");*/