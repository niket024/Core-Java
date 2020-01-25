package com.nik.tree;

public class TreeTraversalDemo
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

		System.out.println("Inorder traversal left->root->right");
		binaryTree.inOrderTraversal(root);
		System.out.println();
		System.out.println("Preorder traversal root->left->right");
		binaryTree.preOrderTraversal(root);
		System.out.println();
		System.out.println("Postorder traversal left->right->root");
		binaryTree.postOrderTraversal(root);
	}
}
