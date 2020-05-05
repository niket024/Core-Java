package com.nik.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class HorizontalVerticleTopViewTraversal {
	public static void main(String[] args) {
		Node root = new Node(1);
		Node two = new Node(2);
		Node three = new Node(3);
		Node four = new Node(4);
		Node five = new Node(5);
		Node six = new Node(6);
		Node seven = new Node(7);
		Node eight = new Node(8);
		Node nine = new Node(9);

		root.left = two;
		root.right = three;

		root.left.left = four;
		root.left.right = five;

		root.right.left = six;
		root.right.right = seven;
		
		root.left.left.left = eight;
		root.left.left.right = nine;

		int hd = 0;

		Map<Integer, List<Integer>> map = new TreeMap<Integer, List<Integer>>();
		hd = 0;
		System.out.println("Horizontal traversal");

		horizontalTraversal(root, hd, map);
		map.forEach((k, v) -> {
			v.forEach(e -> System.out.print(e + " "));
		});
		
		map.clear();
		System.out.println();
		System.out.println("Verticle traversal");
		verticleTraversal(root, hd, map);
		map.forEach((k, v) -> {
			v.forEach(e -> System.out.print(e + " "));
		});
		
		System.out.println();
		System.out.println("Top view traversal");
		map.forEach((k, v) -> {
			System.out.print(v.get(0) + " ");
		});

	}

	private static void verticleTraversal(Node root, int hd, Map<Integer, List<Integer>> map) {
		if (root == null) {
			return;
		} else {
			if (map.containsKey(hd)) {
				List<Integer> list = map.get(hd);
				list.add(root.data);
				map.put(hd, list);
			} else {
				List<Integer> list = new ArrayList<Integer>();
				list.add(root.data);
				map.put(hd, list);
			}
			verticleTraversal(root.left, hd - 1, map);
			verticleTraversal(root.right, hd + 1, map);
		}

	}

	private static void horizontalTraversal(Node root, int hd, Map<Integer, List<Integer>> map) {
		if (root == null) {
			return;
		} else {
			if (map.containsKey(hd)) {
				List<Integer> list = map.get(hd);
				list.add(root.data);
				map.put(hd, list);
			} else {
				List<Integer> list = new ArrayList<Integer>();
				list.add(root.data);
				map.put(hd, list);
			}
			horizontalTraversal(root.left, hd + 1, map);
			horizontalTraversal(root.right, hd + 1, map);
		}

	}
}
