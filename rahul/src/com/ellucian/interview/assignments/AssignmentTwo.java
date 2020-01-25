package com.ellucian.interview.assignments;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import com.ellucian.interview.assignments.helper.ExecutionTimeHelper;

public class AssignmentTwo
{

	public AssignmentTwo()
	{
		executeApproach();
	}

	private void executeApproach()
	{
		System.out.println("Select approach (1 or 2):");

		try
		{
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					System.in));
			Integer assignmentNo;
			int inputArray[] = { 100, 70, 20, 10, 30, 50, 20 };
			int capacity = 90;

			assignmentNo = Integer.valueOf(reader.readLine());
			switch (assignmentNo) {
			case 1:
				System.out.println("Approach 1");
				approachOne(inputArray, capacity);
				break;
			case 2:
				System.out.println("Approach 2");
				approachTwo(inputArray, capacity);
				break;
			default:
				System.out.println("Invalid Input");
			}
		} catch (Exception e)
		{
			System.out.println("Exception occured: " + e.getMessage());
		}
	}

	public static void main(String[] args)
	{
		int inputArray[] = { 100, 70, 20, 10, 30, 50, 20, 5, 6, 7 };
		int capacity = 90;
		// approachOne(inputArray,capacity);
		approachTwo(inputArray, capacity);
	}

	private static void approachOne(int inputArray[], int capacity)
	{

		// truck capacity 100sqft
		// safe capacity 90 sqft
		// 90-array(i) = x (this is passed on to getTwoElements method.
		// Used LinkedList to eliminate the duplicate
		long startTime = System.currentTimeMillis();
		int sum = 0;
		Arrays.sort(inputArray);

		List<Integer> temp = new LinkedList<Integer>();
		for (int i = 0; i < inputArray.length; i++)
		{
			int currentEle = inputArray[i];
			sum = capacity - currentEle;
			getTwoElements(inputArray, sum, currentEle, temp);
		}
		long endTime = System.currentTimeMillis();
		ExecutionTimeHelper.printExecutionTime(startTime, endTime);
	}

	public static void getTwoElements(int arr[], int sum, int currentEle,
			List<Integer> temp)
	{
		int arrayLength = arr.length;
		int i = 0;
		int j = arrayLength - 1;

		while (i < j)
		{
			if (arr[i] + arr[j] == sum)
			{
				if (!(temp.contains(currentEle) && temp.contains(arr[i]) && temp
						.contains(arr[j])))
				{
					System.out.println("(" + currentEle + ", " + arr[i] + ", "
							+ arr[j] + ")");
				}
				temp.add(currentEle);
				temp.add(arr[i]);
				temp.add(arr[j]);
			}
			if (arr[i] + arr[j] > sum)
			{
				j--;
			} else
			{
				i++;
			}
		}
	}

	private static void approachTwo(int inputArray[], int capacity)
	{
		int sum = 0;
		long startTime = System.currentTimeMillis();
		List<Integer> temp = new LinkedList<Integer>();
		for (int i = 0; i < inputArray.length; i++)
		{

			int currentEle = inputArray[i];
			sum = capacity - currentEle;
			if (sum > 0)
			{
				getTwoElementsTwo(inputArray, sum, currentEle, temp);
			}
		}
		long endTime = System.currentTimeMillis();
		ExecutionTimeHelper.printExecutionTime(startTime, endTime);
	}

	public static void getTwoElementsTwo(int arr[], int sum, int currentEle,
			List<Integer> temp)
	{
		int arrayLength = arr.length;
		int i = 0;
		for (int n = 0; n < arrayLength; n++)
		{
			int x = sum - arr[n];
			i = n + 1;
			while (i < arrayLength && x >= 0)
			{
				if (arr[i] == x
						&& !(temp.contains(currentEle) && temp.contains(arr[i]) && temp
								.contains(arr[n])))
				{
					System.out.println("(" + currentEle + ", " + arr[i] + ", "
							+ arr[n] + ")");
					temp.add(currentEle);
					temp.add(arr[i]);
					temp.add(arr[n]);
					break;
				}
				i++;
			}
		}
	}
}
