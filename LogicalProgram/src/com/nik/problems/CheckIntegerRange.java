package com.nik.problems;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckIntegerRange {
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		if (scanner.hasNextInt()) {
			callMethod(scanner.nextInt());
		} else {
			System.out.println("Value is not an integer");
		}
		anotherWay(scanner);
		scanner.close();
	}

	private static void anotherWay(Scanner scanner) {
		System.out.println("Enter another number");
		try {
			scanner.next();
			int input = scanner.nextInt();
			System.out.println("Valid Integer range " + input);
		} catch (InputMismatchException e) {
			System.out.println("Invalid integer range");
		}
	}

	private static void callMethod(int nextInt) {
		System.out.println("input = " + nextInt);

	}

}
