package com.pack2;

import java.util.ArrayList;

public class AutoUpcasting
{
	public static void main(String[] args)
	{
		A a1 = new A();
		
		A a2 = new B();
		A a3 = new C();
		A a4 = new D();
		
		B b1 = new C();
		B b2 = new D();
		C c1 = new D();
		
		Object obj = new A();
		
		
		
		D d1 = (D) new A();
		
	}
}
