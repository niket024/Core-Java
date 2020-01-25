package vector;

import java.util.Arrays;

public class MyQueue
{
	private int queuSize;
	private int[] queueArr;
	private int top;
	private int pointer;

	public MyQueue(int size)
	{
		this.queuSize = size;
		this.queueArr = new int[queuSize];
		this.top = -1;
		pointer = 0;
	}

	public void push(int entry)
	{
		if (this.isQueueFull())
		{
			System.out.println(("Queue is full. Increasing the capacity."));
			this.increaseQueueCapacity();
		}
		System.out.println("Adding: " + entry);
		this.queueArr[++top] = entry;
	}

	public int pop() throws Exception
	{
		if (this.isQueueEmpty())
		{
			throw new Exception("Queue is empty. Can not remove element.");
		}
		int entry = this.queueArr[pointer];
		this.pointer++;
		System.out.println("Removed entry: " + entry);
		return entry;
	}

	public long peek()
	{
		return queueArr[top];
	}

	private void increaseQueueCapacity()
	{

		int[] newQueue = new int[this.queuSize * 2];
		for (int i = 0; i < queuSize; i++)
		{
			newQueue[i] = this.queueArr[i];
		}
		this.queueArr = newQueue;
		this.queuSize = this.queuSize * 2;
	}

	public boolean isQueueEmpty()
	{
		return (top == -1);
	}

	public boolean isQueueFull()
	{
		return (top == queuSize - 1);
	}

	public static void main(String[] args) throws Exception
	{
		MyQueue queue = new MyQueue(2);
		for (int i = 1; i < 10; i++)
		{
			queue.push(i);
		}
		for (int i = 1; i < 4; i++)
		{
			try
			{
				queue.pop();
			} catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		queue.push(23);
		queue.pop();
		//System.out.println(Arrays.toString(queue.queueArr));
	}
}
