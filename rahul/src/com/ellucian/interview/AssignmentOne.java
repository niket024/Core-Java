package com.ellucian.interview;

import java.util.Arrays;

public class AssignmentOne {

	public void findTwoElements(int arr[], int sum) {
		int arrayLength = arr.length;
		int i = 0;
		int j = arrayLength - 1;

		while (i < j) {
			if (arr[i] + arr[j] == sum) {
				System.out.println("(" + arr[i] + ", " + arr[j] + ")");
			}
			if (arr[i] + arr[j] > sum) {
				j--;
			} else {
				i++;
			}
		}
	}

	public static void main(String[] args) {
		// Find all pair elements which gives sum = 16
		int inputArray[] = { 10, 6, 4, 2, 16, 0, 3, 5, 15 };
		Arrays.sort(inputArray);

		AssignmentOne assignmentOne = new AssignmentOne();
		assignmentOne.findTwoElements(inputArray, 16);
	}
}
