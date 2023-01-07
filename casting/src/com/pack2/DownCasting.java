package com.pack2;

public class DownCasting
{
	public static void main(String[] args)
	{
		/*D d1 = new D();
		D d2 = new A();
		D d3 = new B();
		D d4 = new C();
*/
		 D d2 = (D) new A();
		 D d3 = (D) new B();
		 D d4 = (D) new C();
		 D d5 = (D) new Object();

		

		System.out.println("done");
	}

}
