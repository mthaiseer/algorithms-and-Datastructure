package bsf;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

	public void bfs(Vertex root) {

		Queue<Vertex> queue = new LinkedList<>();
		root.setVisited(true);
		queue.add(root);

		while (!queue.isEmpty()) {
			Vertex current = queue.remove();
			System.out.print(" " + current.getData());

			for (Vertex v : current.getAdjecencyList()) {
				if (!v.isVisited()) {
					v.setVisited(true);
				}

				queue.add(v);
			}
		}

	}

}
