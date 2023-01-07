package com.lara.pack1;
class Shared 
{
	synchronized void test1(Shared s1)
	{
		System.out.println(1);
		Util.sleep(1000);
		s1.test2(this);
		System.out.println(2);
	}
	synchronized void test2(Shared s1)
	{
		System.out.println(3);
		Util.sleep(1000);
		s1.test1(this);
		System.out.println(4);
	}
}
class E extends Thread
{
	Shared s1,s2;
	public E(Shared s1,Shared s2)
	{
		this.s1=s1;
		this.s2=s2;
	}
	public void run()
	{
		s1.test1(s2);
	}
}
class F extends Thread
{

	Shared s1,s2;
	public F(Shared s1,Shared s2)
	{
		this.s1=s1;
		this.s2=s2;
	}
	public void run()
	{
		s2.test2(s1);
	}	
}
public class Manager6
{
 public static void main(String[] args)
{
	Shared s1=new Shared();
	Shared s2=new Shared();
	E e1=new E(s1,s2);
	F f1=new F(s1,s2);
	e1.start();
	f1.start();
	Util.sleep(10000);
	System.out.println(e1.getState());
	System.out.println(f1.getState());
}
}
