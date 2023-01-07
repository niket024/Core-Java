public class C
{
	public static void main(String[] args)
	{
		String s1 = "123";
	   //int k=s1;
		Integer obj = new Integer(s1);
		int i = obj.intValue();
		System.out.println(i);
		
		Double obj2 = new Double(s1);
		double d1 = obj2.doubleValue();
		System.out.println(d1);
		System.out.println("done");
	}
}
