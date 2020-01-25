package test;

import java.util.ArrayList;
import java.util.List;

public class SingletonTest
{
	static List<SingletonTest> objs = new ArrayList<SingletonTest>();

	private SingletonTest()
	{

	}

	static
	{
		objs.add(new SingletonTest());
		objs.add(new SingletonTest());
	}
	private volatile boolean isCallFirst = true;

	public SingletonTest getInstance()
	{
		synchronized (this)
		{
			if (isCallFirst)
			{
				isCallFirst = false;

				return objs.get(0);
			} else
			{
				isCallFirst = true;
				return objs.get(1);
			}
		}
	}
}
