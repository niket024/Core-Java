package com.nik.graph;

import java.util.ArrayList;
import java.util.List;

public class Graph {

	private int vertices;

	private ArrayList<Integer>[] adjList;

	public Graph(int vertices) {

		this.vertices = vertices;

		initAdjList();
	}

	private void initAdjList() {
		adjList = new ArrayList[vertices];

		for (int i = 0; i < vertices; i++) {
			adjList[i] = new ArrayList<>();
		}
	}

	public void addEdge(int u, int v) {
		adjList[u].add(v);
	}

	public void printAllPaths(int s, int d) {
		boolean[] isVisited = new boolean[vertices];
		ArrayList<Integer> pathList = new ArrayList<>();

		pathList.add(s);

		printAllPathsUtil(s, d, isVisited, pathList);
	}

	private void printAllPathsUtil(Integer u, Integer d, boolean[] isVisited, List<Integer> localPathList) {

		isVisited[u] = true;

		if (u.equals(d)) {
			System.out.println(localPathList);
			isVisited[u] = false;
			return;
		}

		for (Integer i : adjList[u]) {
			if (!isVisited[i]) {

				localPathList.add(i);
				printAllPathsUtil(i, d, isVisited, localPathList);
				localPathList.remove(i);
			}
		}

		isVisited[u] = false;
	}

	public static void main(String[] args) {
		Graph g = new Graph(8);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(1, 4);
		g.addEdge(1, 5);
		g.addEdge(2, 6);
		g.addEdge(3, 6);
		g.addEdge(3, 7);
		g.addEdge(4, 7);
		g.addEdge(3, 8);
		g.addEdge(5, 8);

		int s = 1;

		int d = 8;

		System.out.println("Following are all different paths from " + s + " to " + d);
		g.printAllPaths(s, d);

	}
}
