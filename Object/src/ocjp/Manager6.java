package ocjp;

class W
{
	int i;
}

class X
{
	int i;

	@Override
	public boolean equals(Object obj)
	{
		X obj1 = (X) obj;
		return i == obj1.i;
	}
}

public class Manager6
{
	public static void main(String[] args)
	{
     W obj1=new W();
     W obj2=new W();
     X obj3=new X();
     X obj4=new X();
     obj1.i=10;
     obj2.i=10;
     obj3.i=10;
     obj4.i=10;
     System.out.println(obj1.equals(obj2));
     System.out.println("---------------");
     System.out.println(obj3.equals(obj4));
     System.out.println("---------------");
     System.out.println(obj1.equals(obj3));
     System.out.println("----------------");
     System.out.println(obj3.equals(obj1));
     
	}
}
