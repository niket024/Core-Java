package com.nik.singleton;

public class DoubleCheckedLockingSingleton
{
	private static DoubleCheckedLockingSingleton instance;

	private DoubleCheckedLockingSingleton()
	{

	}

	public static DoubleCheckedLockingSingleton getInstanceUsingDoubleLocking()
	{
		if (instance == null)
		{
			synchronized (DoubleCheckedLockingSingleton.class)
			{
				if (instance == null)
				{
					instance = new DoubleCheckedLockingSingleton();
				}
			}
		}
		return instance;
	}
}
