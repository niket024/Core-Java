package com.nik.tree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
	Stack<Node> stack = new Stack<>();

	public Node createNode(int data) {
		Node node = new Node();
		node.data = data;
		node.left = null;
		node.right = null;
		return node;
	}

	public void printData(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + ",");
		printData(root.left);
		printData(root.right);

	}

	public void inOrderTraversal(Node root) {
		if (root == null) {
			return;
		}
		inOrderTraversal(root.left);
		System.out.print(root.data + ", ");
		inOrderTraversal(root.right);

	}

	public void preOrderTraversal(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + ", ");
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);

	}

	public void postOrderTraversal(Node root) {
		if (root == null) {
			return;
		}
		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		System.out.print(root.data + ", ");

	}

	public int getTreeNodeCount(Node root) {
		if (root == null) {
			return 0;
		}
		return 1 + getTreeNodeCount(root.left) + getTreeNodeCount(root.right);
	}

	public int getTreeNodeSum(Node root) {
		if (root == null) {
			return 0;
		}
		return root.data + getTreeNodeSum(root.left) + getTreeNodeSum(root.right);
	}

	public int getTreeNodeDiff(Node root) {
		if (root == null) {
			return 0;
		}
		return root.data - getTreeNodeDiff(root.left) + getTreeNodeDiff(root.right);
	}

	public void printInOrderDataWithIterative(Node root) {
		while (true) {
			while (root != null) {
				stack.push(root);
				root = root.left;
			}
			if (stack.isEmpty()) {
				break;
			}
			root = stack.pop();
			System.out.print(root.data + ", ");
			root = root.right;
		}

	}

	public void printPreOrderDataWithIterative(Node root) {
		while (true) {
			while (root != null) {
				System.out.print(root.data + ", ");
				stack.push(root);
				root = root.left;
			}
			if (stack.isEmpty()) {
				break;
			}
			root = stack.pop();
			root = root.right;
		}

	}

	public int getHeightOfBinaryTree(Node root) {
		if (root == null)
			return 0;
		else {
			int lHeight = getHeightOfBinaryTree(root.left);
			int rHeight = getHeightOfBinaryTree(root.right);
			if (lHeight > rHeight) {
				return (lHeight + 1);
			} else {
				return (rHeight + 1);
			}
			// return 1+ Math.max(getHeightOfBinaryTree(root.left),
			// getHeightOfBinaryTree(root.right));
		}
	}

	public void printLevelOrder(Node root) {
		if (root != null) {
			Queue<Node> queue = new ArrayDeque<Node>();
			queue.add(root);
			while (!queue.isEmpty()) {
				Node tempNode = queue.poll();
				System.out.print(tempNode.data + " ");
				if (tempNode.left != null) {
					queue.add(tempNode.left);
				}
				if (tempNode.right != null) {
					queue.add(tempNode.right);
				}
			}
		} else {
			System.out.println("Empty tree");
		}

	}

	public boolean isIdentical(Node root, Node root1) {
		if (root == null && root1 == null) {
			return true;
		} else {
			return ((root != null && root1 != null) && (root.data == root1.data) && isIdentical(root.left, root1.left)
					&& isIdentical(root.right, root1.right));
		}
	}

	public void findAvgAtLevel(Node root) {
		Queue<Node> queue = new ArrayDeque<Node>();
		queue.add(root);
		int sum = 0;
		while (!queue.isEmpty()) {
			int count = queue.size();
			int no = count;
			sum = 0;
			while (count >= 1) {
				Node node = queue.poll();
				if (node != null) {
					sum += node.data;
					if (node.left != null)
						queue.add(node.left);
					if (node.right != null)
						queue.add(node.right);
				}
				count--;
			}
			System.out.println(sum / no);
		}
	}

	public void printZigZag(Node root) {
		Stack<Node> s1 = new Stack<Node>();
		Stack<Node> s2 = new Stack<Node>();
		s1.push(root);
		while (!s1.isEmpty() || !s2.isEmpty()) {
			System.out.println("\n------------------");
			while (!s1.isEmpty()) {
				Node node = s1.pop();
				System.out.print(node.data + " ");
				if (node.left != null)
					s2.push(node.left);
				if (node.right != null)
					s2.push(node.right);
			}
			System.out.println("\n------------------");

			while (!s2.isEmpty()) {
				Node node = s2.pop();
				System.out.print(node.data + " ");
				if (node.right != null)
					s1.push(node.right);
				if (node.left != null)
					s1.push(node.left);
			}
		}
	}

	public void printLeafNode(Node root) {
		if (root != null) {
			if (root.left == null && root.right == null) {
				System.out.println(root.data);
			}
			printLeafNode(root.left);
			printLeafNode(root.right);
		}

	}

}
