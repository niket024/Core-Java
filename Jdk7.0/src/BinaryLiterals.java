public class BinaryLiterals
{
	public static void main(String args[])
	{
		int i=0b0111;
		byte twelve = 12;
		byte sixPlusSix = 0xC;
		byte fourTimesThree = 0b1100;
        long l =11100;
        long l1 =0b11100;
        //here ob is the prefix for binary 
		System.out.println(twelve);
		System.out.println(sixPlusSix);
		System.out.println(fourTimesThree);
		System.out.println(i);
		System.out.println(l);
		System.out.println(l1);
		int i1=8;
		int i2=0b1000;
				if(i1==i2)
				{
					System.out.println("same");
				}
				else
				{
					System.out.println("different");
				}

	}
}