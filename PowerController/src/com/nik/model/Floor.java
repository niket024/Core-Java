package com.nik.model;

import java.util.List;

import com.nik.model.Corridor;

public class Floor
{
	private String floorName;

	private List<Corridor> mainCorridors;

	private List<Corridor> subCorridors;

	public Floor(String floorName, List<Corridor> mainCorridors,
			List<Corridor> subCorridors)
	{
		super();
		this.floorName = floorName;
		this.mainCorridors = mainCorridors;
		this.subCorridors = subCorridors;
	}

	public String getFloorName()
	{
		return floorName;
	}

	public void setFloorName(String floorName)
	{
		this.floorName = floorName;
	}

	public List<Corridor> getMainCorridors()
	{
		return mainCorridors;
	}

	public void setMainCorridors(List<Corridor> mainCorridors)
	{
		this.mainCorridors = mainCorridors;
	}

	public List<Corridor> getSubCorridors()
	{
		return subCorridors;
	}

	public void setSubCorridors(List<Corridor> subCorridors)
	{
		this.subCorridors = subCorridors;
	}

}
