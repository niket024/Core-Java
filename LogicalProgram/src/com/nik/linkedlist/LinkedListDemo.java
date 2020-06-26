package com.nik.linkedlist;

public class LinkedListDemo {
	public static void printNode(Node head) {
		Node root = head;
		while (root != null) {
			System.out.print(root.data + "->");
			root = root.next;
		}
	}

	public static Node reverse(Node head) {
		Node next = null;
		Node prev = null;
		Node current = head;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;

		}
		return prev;

	}

	public static int getNoOfNode(Node head) {
		Node current = head;
		int count = 0;
		while (current != null) {
			count++;
			current = current.next;
		}
		return count;
	}

	public static Node addNodeAtBeginning(Node newNode, Node head) {
		newNode.next = head;
		head = newNode;
		return head;

	}

	public static void addNodeAtEnd(Node newNode, Node head) {
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}

	public static void addNodeAfter(Node newNode, Node node4) {
		newNode.next = node4.next;
		node4.next = newNode;
	}

	public static void addNodeAt(Node newNode, int position, Node head) {
		int count = 0;
		Node current = head;
		while (count < position - 1) {
			count++;
			current = current.next;
		}
		newNode.next = current.next;
		current.next = newNode;

	}

	public static Node deleteFirstNode(Node head) {
		Node tempHead = head;
		head = head.next;
		tempHead.next = null;
		tempHead = null;
		return head;

	}

	public static Node deletelastNode(Node head) {
		Node current = head;
		while (current.next.next != null) {
			current = current.next;
		}
		current.next = null;
		return head;
	}

	public static void findMiddleNode(Node head) {
		if (head != null) {
			Node fast = head;
			Node slow = head;
			while (fast != null && fast.next != null) {
				fast = fast.next.next;
				slow = slow.next;
			}
			System.out.println(slow.data);
		}

	}

	public static Node deleteNodeWithoutRoot(Node node3) {
		node3.data = node3.next.data;
		node3.next = node3.next.next;
		node3 = null;
		return null;
	}
}
