package Project;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	int vertices;
	int adjacencyMatrix[][];
	boolean visited[];
	Queue<Integer> nextNode;

	public BFS(int vertices, int[][] adjacencyMatrix) {
		this.vertices = vertices;
		this.adjacencyMatrix = adjacencyMatrix;
		this.visited = new boolean[vertices];
		this.nextNode = new LinkedList<>();
	}

	public void performBFS(int startVertex) {
		System.out.print(startVertex + 1);
		searchingBFS(startVertex);
		visited[startVertex] = true;
		while (!nextNode.isEmpty()) {
			searchingBFS(nextNode.poll());
		}
		System.out.println();
	}

	private void searchingBFS(int vertex) {
		for (int i = 0; i < vertices; i++) {
			if (adjacencyMatrix[vertex][i] == 1 && !visited[i]) {
				nextNode.add(i);
				visited[i] = true;
				System.out.print(" - " + (i + 1));
			}
		}
	}

}
