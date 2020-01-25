package com.ellucian.interview.runner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.ellucian.interview.assignments.AssignmentFour;
import com.ellucian.interview.assignments.AssignmentOne;
import com.ellucian.interview.assignments.AssignmentThree;
import com.ellucian.interview.assignments.AssignmentTwo;

public class AssignmentRunner {

	public static void main(String[] args) {

		try {
			System.out.println("Enter the assignment no (1-4 integers):");

			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			Integer assignmentNo = Integer.valueOf(reader.readLine());
			while (assignmentNo != 0) {
				switch (assignmentNo) {
				case 1:
					System.out.println("Assignment 1");
					new AssignmentOne();
					break;
				case 2:
					System.out.println("Assignment 2");
					new AssignmentTwo();
					break;
				case 3:
					System.out.println("Assignment 3");
					new AssignmentThree();
					break;
				case 4:
					System.out.println("Assignment 4");
					new AssignmentFour();
					break;
				case 5:
					System.out.println("Assignment 1: Find pair of array");
					System.out.println("Assignment 2: Truck load problem");
					System.out.println("Assignment 3: RPN-Reverse polish notation");
					System.out.println("Assignment 4: Find second largest number");
					break;
				default:
					System.out.println("Invalid Input please press 5 for help and 0 to exit!");
					break;
				}
				System.out.println("\n\n----------------------------------------");
				System.out.println("Enter the assignment no (1-4 integers and 0 to exit):");
				reader = new BufferedReader(new InputStreamReader(System.in));
				assignmentNo = Integer.valueOf(reader.readLine());
			}
		} catch (NumberFormatException e) {
			System.out.println("Number Format Exception: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("IO Exception: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception occured: " + e.getMessage());
		}

	}

}
