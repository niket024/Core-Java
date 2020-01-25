package com.ellucian.interview.assignments;

import java.util.LinkedList;
import java.util.List;

import com.ellucian.interview.assignments.helper.ExecutionTimeHelper;

public class AssignmentFour {

	public AssignmentFour() {
		execute();
	}

	private static void execute() {
		List<Integer> inputList = new LinkedList<>();
		inputList.add(0);
		inputList.add(12);
		inputList.add(1);
		inputList.add(2);
		int length = inputList.size();
		findSecondLargestNumber(inputList, length);
	}

	public static void findSecondLargestNumber(List<Integer> inputList, int arr_size) {
		long startTime = System.currentTimeMillis();
		int temp1 = Integer.MIN_VALUE;
		int temp2 = Integer.MIN_VALUE;

		if (arr_size < 2) {
			System.out.print(" Invalid Input: There must be atleast 2 elements ");
			return;
		}

		for (Integer ele : inputList) {
			if (ele > temp1) {
				temp2 = temp1;
				temp1 = ele;
			}

			else if (ele > temp2 && ele != temp1)
				temp2 = ele;
		}

		if (temp2 == Integer.MIN_VALUE)
			System.out.println("All elements in the given array are same!");
		else
			System.out.println("The second largest element: " + temp2);
		long endTime = System.currentTimeMillis();
		ExecutionTimeHelper.printExecutionTime(startTime, endTime);
	}

	public static void main(String[] args) {
		// int inputArray[] = {35,12, 1, 10, 34, 1};
		execute();
		// printSecondLargest(inputArray,inputArray.length);
	}

	public static void printSecondLargest(int[] a, int length) {
		long startTime = System.currentTimeMillis();
		int temp;
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("The second largest element: " + a[length - 2]);
		long endTime = System.currentTimeMillis();
		ExecutionTimeHelper.printExecutionTime(startTime, endTime);
	}
}
