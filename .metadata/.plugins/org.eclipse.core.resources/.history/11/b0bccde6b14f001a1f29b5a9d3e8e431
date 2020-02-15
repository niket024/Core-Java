package com.nik.tree;

public class CheckForIdenticalTree {
	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		Node root = binaryTree.createNode(2);
		root.left = binaryTree.createNode(7);
		root.right = binaryTree.createNode(5);
		root.left.left = binaryTree.createNode(2);
		root.left.right = binaryTree.createNode(6);
		root.right.right = binaryTree.createNode(9);
		root.left.right.left = binaryTree.createNode(1);
		root.left.right.right = binaryTree.createNode(11);
		root.right.right.left = binaryTree.createNode(4);
		root.right.right.left.right = binaryTree.createNode(4);

		Node root1 = binaryTree.createNode(2);
		root1.left = binaryTree.createNode(7);
		root1.right = binaryTree.createNode(5);
		root1.left.left = binaryTree.createNode(2);
		root1.left.right = binaryTree.createNode(6);
		root1.right.right = binaryTree.createNode(9);
		root1.left.right.left = binaryTree.createNode(1);
		root1.left.right.right = binaryTree.createNode(11);
		root1.right.right.left = binaryTree.createNode(4);
		root1.right.right.left.right = binaryTree.createNode(4);
		System.out.println("Is two tree ae Identical? " + binaryTree.isIdentical(root, root1));
	}
}
