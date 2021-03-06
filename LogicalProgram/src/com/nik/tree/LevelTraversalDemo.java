package com.nik.tree;

public class LevelTraversalDemo {
	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		
		Node rootNode =new Node(40);
		
		Node node20=new Node(20);
		Node node10=new Node(10);
		Node node30=new Node(30);
		
		Node node60=new Node(60);
		Node node50=new Node(50);
		Node node70=new Node(70);
 
		rootNode.left=node20;
		rootNode.right=node60;
 
		node20.left=node10;
		node20.right=node30;
 
		node60.left=node50;
		node60.right=node70;
		//this solution has space complexity
		binaryTree.printLevelOrder(rootNode);
		System.out.println("\n---------another way-------------");
		//This solution has time complexity
		levelOrderTraversal(rootNode);
	}
	public static boolean printLevel(Node root, int level)
	{
		
		// base case
		if (root == null) {
			return false;
		}

		if (level == 1)
		{
			System.out.print(root.data + " ");

			// return true if at-least one node is present at given level
			return true;
		}

		boolean left = printLevel(root.left, level - 1);
		boolean right = printLevel(root.right, level - 1);

		return left || right;
	}

	// Function to print level order traversal of given binary tree
	public static void levelOrderTraversal(Node root)
	{
		// start from level 1 -- till height of the tree
		int level = 1;

		// run till printLevel() returns false
		while (printLevel(root, level)) {
			System.out.println();
			level++;
		}
	}
}
