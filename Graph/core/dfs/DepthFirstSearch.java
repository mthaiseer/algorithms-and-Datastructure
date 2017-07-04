package dfs;

import java.util.Stack;

public class DepthFirstSearch {

	public void dfs(Vertex root) {

		Stack<Vertex> stack = new Stack<>();
		stack.push(root);
		root.setVisited(true);

		while (!stack.isEmpty()) {

			Vertex current = stack.pop();
			System.out.print(" " + current.getData());

			for (Vertex v : current.getAdjecencyList()) {
				if (!v.isVisited()) {
					v.setVisited(true);
					stack.push(v);
				}
			}
		}

	}

}
