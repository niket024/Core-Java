package com.nik.linkedlist;

public class AddNodeAtBeginning
{
	public static void main(String[] args)
	{
		Node node1 = new Node(10);
		Node node2 = new Node(20);
		Node node3 = new Node(30);
		Node node4 = new Node(40);
		Node node5 = new Node(50);
		Node node6 = new Node(60);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		System.out.println("Before adding");
		LinkedListDemo.printNode(node1);
		Node newHead = LinkedListDemo.addNodeAtBeginning(new Node(70), node1);
		System.out.println("\nAfter adding");
		LinkedListDemo.printNode(newHead);
	}
}
