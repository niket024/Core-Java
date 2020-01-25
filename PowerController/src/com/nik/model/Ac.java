package com.nik.model;

import com.nik.util.Constants;

public class Ac
{
	private String acStatus = Constants.ON;
	private int acUnits;

	public Ac(String acStatus, int acUnits)
	{
		super();
		this.acStatus = acStatus;
		this.acUnits = acUnits;
	}

	public String getAcStatus()
	{
		return acStatus;
	}

	public void setAcStatus(String acStatus)
	{
		this.acStatus = acStatus;
	}

	public int getAcUnits()
	{
		return acUnits;
	}

	public void setAcUnits(int acUnits)
	{
		this.acUnits = acUnits;
	}

}
