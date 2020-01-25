package com.ellucian.interview.assignments;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import com.ellucian.interview.assignments.helper.ExecutionTimeHelper;

public class AssignmentOne
{

	public AssignmentOne()
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
			// Find all pair of elements which gives sum = 16
			int inputArray[] = { 10, 6, 4, 2, 16, 0, 3, 5, -15, -1 };
			int sum = 16;

			assignmentNo = Integer.valueOf(reader.readLine());
			switch (assignmentNo) {
			case 1:
				System.out.println("Approach 1");
				approachOne(inputArray, sum);
				break;
			case 2:
				System.out.println("Approach 2");
				approachTwo(inputArray, sum);
				break;
			default:
				System.out.println("Invalid Input");
			}
		} catch (Exception e)
		{
			System.out.println("Exception occured: " + e.getMessage());
		}
	}

	public void approachOne(int arr[], int sum)
	{
		long startTime = System.currentTimeMillis();
		int arrayLength = arr.length;
		int i = 0;
		List<Integer> result = new LinkedList<Integer>();
		for (int n = 0; n < arrayLength; n++)
		{
			int x = sum - arr[n];
			i = n + 1;
			while (i < arrayLength)
			{
				if (arr[i] == x
						&& !(result.contains(arr[i]) && result.contains(arr[n])))
				{
					System.out.println("(" + arr[i] + ", " + arr[n] + ")");
					result.add(arr[i]);
					result.add(arr[n]);
					break;
				}
				i++;
			}
		}
		long endTime = System.currentTimeMillis();
		ExecutionTimeHelper.printExecutionTime(startTime, endTime);
	}

	public void approachTwo(int arr[], int sum)
	{
		long startTime = System.currentTimeMillis();
		Arrays.sort(arr);
		int arrayLength = arr.length;
		int i = 0;
		int j = arrayLength - 1;
		List<Integer> result = new LinkedList<Integer>();
		while (i < j)
		{
			if ((arr[i] + arr[j]) == sum
					&& !(result.contains(arr[i]) && result.contains(arr[j])))
			{
				System.out.println("(" + arr[i] + ", " + arr[j] + ")");
				result.add(arr[i]);
				result.add(arr[j]);
			}
			if (arr[i] + arr[j] > sum)
			{
				j--;
			} else
			{
				i++;
			}
		}
		long endTime = System.currentTimeMillis();
		ExecutionTimeHelper.printExecutionTime(startTime, endTime);
	}

	public static void main(String[] args)
	{
		// Find all pair elements which gives sum = 16
		int inputArray[] = { 10, 6, 4, 2, 16, 0, 3, 5, 15, 1, 16, 0 };

		AssignmentOne assignmentOne = new AssignmentOne();
		assignmentOne.approachOne(inputArray, 16);
		// assignmentOne.approachTwo(inputArray, 16);
	}
}
