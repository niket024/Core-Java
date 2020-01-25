class U<A extends Number>
{

}

public class Manager3
{
	public static void main(String[] args)
	{
		U<Integer> u1 = new U<Integer>();
		U<Double> u2 = new U<Double>();
		U<Float> u3 = new U<Float>();
		//U<String> u4 = new U<String>();
		System.out.println("done");
	}
}
