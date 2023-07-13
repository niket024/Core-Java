package queue;

import java.util.PriorityQueue;

public class A
{
	public static void main(String[] args)
	{

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(12);
		pq.add(23);
		pq.add(45);
		pq.add(6);
		pq.add(67);
		pq.add(3);
		pq.add(5);
		pq.add(90);
		pq.add(1);
		System.out.println(pq);
	}
}
