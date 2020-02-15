package com.nik.problems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveDuplicateWord {
public static void main(String[] args) {
	String input = "The the string String string stringing.";
	 
    String regex = "\\b(\\w+)(\\s+\\1\\b)+";

    // Use compile(regex) if you want case sensitive.
    Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

    Matcher m = p.matcher(input);
    while (m.find()) {
        input = input.replaceAll(m.group(), m.group(1));
    }

    System.out.println(input);
}
}
