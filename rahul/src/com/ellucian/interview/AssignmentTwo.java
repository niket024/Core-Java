package com.ellucian.interview;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AssignmentTwo {

	public static void main(String[] args) {
		int inputArray[] = { 100, 70, 20, 10, 30, 50, 20 };
		
		// truck capacity 100sqft
		// safe capacity 90 sqft
		//90-array(i) = x (this is passed on to getTwoElements method.
		//Used LinkedList to eliminate the duplicate
		
		Arrays.sort(inputArray);

		List<Integer> temp = new LinkedList<Integer>();
		for (int i = 0; i < inputArray.length; i++) {
			int currentEle = inputArray[i];
			int sum = 90 - currentEle;
			AssignmentTwo assignmentTwo = new AssignmentTwo();
			assignmentTwo.getTwoElements(inputArray, sum, currentEle, temp);
		}
	}

	public void getTwoElements(int arr[], int sum, int currentEle, List<Integer> temp) {
		int arrayLength = arr.length;
		int i = 0;
		int j = arrayLength - 1;

		while (i < j) {
			if (arr[i] + arr[j] == sum) {
				if (!(temp.contains(currentEle) && temp.contains(arr[i]) && temp.contains(arr[j]))) {
					System.out.println("(" + currentEle + ", " + arr[i] + ", " + arr[j] + ")");
				}
				temp.add(currentEle);
				temp.add(arr[i]);
				temp.add(arr[j]);
			}
			if (arr[i] + arr[j] > sum) {
				j--;
			} else {
				i++;
			}
		}
	}
}
