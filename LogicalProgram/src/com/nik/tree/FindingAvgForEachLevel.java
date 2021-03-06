package com.nik.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;

public class FindingAvgForEachLevel {
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
		binaryTree.findAvgAtLevel(root);
		System.out.println("--------------------------");
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
		int depth = 0;
		levelOrderTraversal(root, map, depth);
		System.out.println(map);
		findAvgAtLevel(map);
	}

	private static void findAvgAtLevel(Map<Integer, List<Integer>> map) {
		map.forEach((k, v) -> {
			OptionalDouble avg = v.stream().mapToInt(i -> i).average();
			System.out.println(avg.getAsDouble());
		});

	}

	private static void levelOrderTraversal(Node rootNode, Map<Integer, List<Integer>> map, int depth) {
		if (rootNode == null) {
			return;
		}
		if (!map.containsKey(depth)) {
			List<Integer> list = new ArrayList<Integer>();
			list.add(rootNode.data);
			map.put(depth, list);
		} else {
			List<Integer> list = map.get(depth);
			list.add(rootNode.data);
			map.put(depth, list);
		}
		levelOrderTraversal(rootNode.left, map, depth + 1);
		levelOrderTraversal(rootNode.right, map, depth + 1);

	}

}
