package queue;

import java.util.PriorityQueue;

public class B
{
	public static void main(String[] args)
	{

		PriorityQueue pq = new PriorityQueue();
		pq.add(12);
		pq.add(23);
		pq.add(45);
		pq.add(6);
		pq.add(3);
		pq.add(0);
		pq.add(5);
		pq.add(90);

		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);

	}
}
