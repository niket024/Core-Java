package com.nik.tree;

public class FindTotaltreeNodeSum
{
	public static void main(String[] args)
	{
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
		System.out.println("Total node Sum = " + binaryTree.getTreeNodeSum(root));
		
	}
}
