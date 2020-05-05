package com.nik.array;

public class ContainsMethodImplementation {
	public static void main(String[] args) {
		String src = "z1abcxyz123ab";
		String pattern = "cxyz1";
		int len = pattern.length() - 1;
		int counter = 0;
		int i, j;
		for (i = 0; i < pattern.length();) {
			for (j = 0; j < src.length();) {
				if (pattern.charAt(i) == src.charAt(j)) {
					if (i == len) {
						break;
					}
					i++;
					j++;
				} else {
					counter++;
					j = counter;
					i = 0;

				}

			}
			if (i == len) {
				break;
			} else if (j == src.length()) {
				break;
			}

		}
		if (i == len) {
			System.out.println("matched");
		} else {
			System.out.println("Not matched");

		}
	}
}
