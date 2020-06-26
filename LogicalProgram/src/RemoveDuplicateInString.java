
public class RemoveDuplicateInString {
	public static void main(String[] args) {
		String s1 = "abcdeedcba";
	
		for (int i = 0; i < s1.length() - 1; i++) {
			if (s1.charAt(i) == s1.charAt(i + 1)) {
				s1 = s1.substring(0, i) + s1.substring(i + 2, s1.length());
				i = 0;
			}
		}
		System.out.println(s1);

	}

	/*
	 * private static String printUnique(String s1) { if (s1.length() <= 1) { return
	 * s1; } else { if (s1.substring(1, 2).equals(s1.substring(0, 1))) { return
	 * printUnique(s1.substring(2, s1.length())); } else { String s2 =
	 * s1.substring(0, 1) + printUnique(s1.substring(1, s1.length())); return
	 * printUnique(s2); }
	 * 
	 * }
	 * 
	 * }
	 */
}
