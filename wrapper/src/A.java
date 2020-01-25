public class A
{
	public static void main(String[] args)
	{
		int i = 90;
		Integer obj = new Integer(i);// Boxing
		System.out.println(obj);
		
		int k = obj.intValue();// Unboxing
		System.out.println(k);
		System.out.println("done");
	}
}
