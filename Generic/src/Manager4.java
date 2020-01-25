class V<A> 
{
	A a1;
}

public class Manager4
{
	public static void main(String[] args)
	{
		V<?> t1 = null;//wild card
		t1 = new V<Integer>();
		t1 = new V<Number>();
		t1 = new V<String>();
		t1 = new V<Object>();
		t1 = new V<S>();
	}
}
