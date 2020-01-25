package com.nik.model;

import java.util.List;

public class Corridor
{
	private List<Bulb> bulbs;
	private List<Ac> acs;
	private String corridorType;

	public Corridor(List<Bulb> bulbs, List<Ac> acs, String corridorType)
	{
		super();
		this.bulbs = bulbs;
		this.acs = acs;
		this.corridorType = corridorType;
	}

	public List<Bulb> getBulbs()
	{
		return bulbs;
	}

	public void setBulbs(List<Bulb> bulbs)
	{
		this.bulbs = bulbs;
	}

	public List<Ac> getAcs()
	{
		return acs;
	}

	public void setAcs(List<Ac> acs)
	{
		this.acs = acs;
	}

	public String getCorridorType()
	{
		return corridorType;
	}

	public void setCorridorType(String corridorType)
	{
		this.corridorType = corridorType;
	}

}
