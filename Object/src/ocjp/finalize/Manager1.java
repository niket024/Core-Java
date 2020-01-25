package ocjp.finalize;

import java.util.*;

class Manager1
{
//	static int i=89;
//	static double d=89;
	public static void main(String s[]) throws Exception
	{
		Runtime rs = Runtime.getRuntime();
		System.out.println("Free memory in JVM before Garbage Collection = "
				+ rs.freeMemory());
		rs.gc();
		System.out.println("Free memory in JVM after Garbage Collection = "
				+ rs.freeMemory());
	}

}
