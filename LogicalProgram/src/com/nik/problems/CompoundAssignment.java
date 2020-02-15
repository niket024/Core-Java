package com.nik.problems;

public class CompoundAssignment {
	public static void main(String[] args) {
		
		int i1 = 5;
		long j1 = 8;
		i1 = i1 + j1;//will not compile
		i1 += j1;//will compile fine because it is equivalent to i = (int) (i1+j1)
		System.out.println(i1 += j1);
	}
}
