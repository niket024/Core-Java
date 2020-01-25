package com.nik.stack;

import java.util.Arrays;

public class StackImplementation {
	int size;
	private int stackSize;
	private int[] stackArr;
	private int top;

	public StackImplementation(int size) {
		this.stackSize = size;
		this.stackArr = new int[stackSize];
		this.top = -1;
	}

	public void push(int entry) {
		if (this.isStackFull()) {
			System.out.println(("Stack is full. Increasing the capacity."));
			this.increaseStackCapacity();
		}
		System.out.println("Adding: " + entry);
		this.stackArr[++top] = entry;
	}

	public int pop() throws Exception {
		if (this.isStackEmpty()) {
			throw new Exception("Stack is empty. Can not remove element.");
		}
		int entry = this.stackArr[top--];
		System.out.println("Removed entry: " + entry);
		return entry;
	}

	public long peek() {
		return stackArr[top];
	}

	private void increaseStackCapacity() {
		stackArr = Arrays.copyOf(stackArr, this.stackSize * 2);
		stackSize = this.stackSize * 2;
	}

	public boolean isStackEmpty() {
		return (top == -1);
	}

	public boolean isStackFull() {
		return (top == stackSize - 1);
	}

	public static void main(String[] args) {
		StackImplementation stack = new StackImplementation(2);
		for (int i = 1; i < 10; i++) {
			stack.push(i);
		}
		for (int i = 1; i < 4; i++) {
			try {
				stack.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
