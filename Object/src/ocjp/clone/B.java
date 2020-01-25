package ocjp.clone;

public class B implements Cloneable
{
	int i;

	public static void main(String[] args) throws CloneNotSupportedException
	{
		B b1 = new B();
		b1.i = 10;
		B b2 = (B) b1.clone();
		System.out.println(b2.i);
		b2.i = 20;
		System.out.println(b1.i);
		b1.i = 30;
		System.out.println(b2.i);
		System.out.println(b1.i);
	}
}
// when ever modification of one object not effecting other then it is called
// DEEP copy cloning.in this program modification is not effecting to each other
// so it is deep copy


// when ever modification of one object  effecting other then it is called
// Sallow copy cloning