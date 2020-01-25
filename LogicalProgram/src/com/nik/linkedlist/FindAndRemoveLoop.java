package com.nik.linkedlist;

public class FindAndRemoveLoop
{

	private static class Node
	{
		int data;
		Node next;

		Node(int data)
		{
			this.data = data;
		}
	}

	public static void main(String[] args)
	{
		Node root = new Node(10);
		Node node2 = new Node(11);
		Node node3 = new Node(12);
		Node node4 = new Node(13);
		Node node5 = new Node(14);
		Node node6 = new Node(15);
		root.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node3;
		// printNode(root);
		detectLoop(root);

	}

	private static void detectLoop(Node root)
	{
		Node slow = root;
		Node fast = root.next;
		while (slow != null && fast != null)
		{
			if (slow == fast)
			{
				System.out.println(fast.data);
				break;
			}
			slow = slow.next;
			fast = fast.next.next;
		}

	}

	private static void printNode(Node root)
	{
		Node node = root;
		while (node != null)
		{
			System.out.print(node.data + "->");
			node = node.next;
		}

	}
}
