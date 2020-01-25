package com.nik.linkedlist;

public class Link {
	Link next;
	int data;
	Link prev;

	public Link() {
	}

	public Link(int data) {
		this.data = data;
	}

	Link head, tail = null;

	public void addNode(int data) {
		Link link = new Link(data);
		if (head == null) {
			head = tail = link;
			head.prev = null;
			head.next = null;
		} else {
			tail.next = link;
			link.prev = tail;
			tail = link;
			tail.next = null;
		}
	}

	public void display() {
		// Node current will point to head
		Link current = head;
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("Nodes of doubly linked list: ");
		while (current != null) {
			// Prints each node by incrementing the pointer.

			System.out.print(current.data + " ");
			current = current.next;
		}
	}
}
