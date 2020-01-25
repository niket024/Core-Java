class T<A extends P>
{
	A i;
}
//www.javatpoint.com
public class Manager2
{
	public static void main(String[] args)
	{
		T<P> t1 = new T<P>();
		T<Q> t2 = new T<Q>();
		T<R> t3 = new T<R>();
		T<S> t4 = new T<S>();
		//T<String> t5=new T<String>();
		System.out.println("done");
	}
}
