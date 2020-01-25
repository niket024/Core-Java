package com.nik.model;

import com.nik.util.Constants;

public class Bulb
{
	private String bulbStatus = Constants.OFF;
	private int bulbsUnits;

	public Bulb(String bulbStatus, int bulbsUnits)
	{
		super();
		this.bulbStatus = bulbStatus;
		this.bulbsUnits = bulbsUnits;
	}

	public String getBulbStatus()
	{
		return bulbStatus;
	}

	public void setBulbStatus(String bulbStatus)
	{
		this.bulbStatus = bulbStatus;
	}

	public int getBulbsUnits()
	{
		return bulbsUnits;
	}

	public void setBulbsUnits(int bulbsUnits)
	{
		this.bulbsUnits = bulbsUnits;
	}

}
