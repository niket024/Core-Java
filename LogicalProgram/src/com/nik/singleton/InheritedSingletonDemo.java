package com.nik.singleton;

class ParentSingleton
{

	private static ParentSingleton instance;

	protected ParentSingleton()
	{
	}

	public static synchronized ParentSingleton getInstance()
	{
		if (instance == null)
		{
			instance = new ParentSingleton();
		}

		return instance;
	}

	public void test()
	{
		System.out.println("test-aparent");
	}
}

class ChildSingleton extends ParentSingleton
{

	private static ChildSingleton instance;

	public static synchronized ParentSingleton getInstance()
	{
		if (instance == null)
		{
			instance = new ChildSingleton();
		}

		return instance;
	}
	
	private  ChildSingleton()
	{
		
	}

	public void test1()
	{
		System.out.println("test1-child");
	}
}

public class InheritedSingletonDemo
{
	public static void main(String[] args)
	{
		ParentSingleton parentSingleton = new ParentSingleton();
		ChildSingleton childSingleton =  (ChildSingleton) ChildSingleton.getInstance();
		childSingleton.test();
		childSingleton.test1();
		parentSingleton.test();
	}
}
