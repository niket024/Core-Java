package queue;

import java.util.PriorityQueue;

class D implements Comparable
{
	int i;

	D(int i)
	{
		this.i = i;

	}

	public int compareTo(Object obj)
	{
		return i - ((D) obj).i;
	}

	public String toString()
	{
		return Integer.toString(i);

	}
}

public class Manager1
{
	public static void main(String[] args)
	{
		PriorityQueue pq = new PriorityQueue();
		pq.add(new D(12));
		pq.add(new D(34));
		pq.add(new D(4));
		pq.add(new D(6));
		pq.add(new D(78));
		pq.add(new D(777));
		pq.add(new D(9));
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
	}

}
