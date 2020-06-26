package com.nik.array;

public class FindPrefix {
	public static void main(String[] args) {
		String str[] = { "sunshine", "sunrise", "sunroof", "sun", "sunny" };
		String s1 = str[0];
		int len = s1.length();
		String s2 = "";
		int arrLength = str.length;
		for (int i = 0; i < len; i++) {
			char c = s1.charAt(i);
			int j = 1;
			boolean flag = false;
			while (j < arrLength) {
				if (str[j].charAt(i) == c) {
					flag = true;
				} else {
					flag = false;
				}
				j++;
			}
			if (flag) {
				s2 += c;
			} else {
				System.out.println(s2);
			}
		}
	}
}
