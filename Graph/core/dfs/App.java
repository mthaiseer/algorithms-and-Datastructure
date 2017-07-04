package dfs;

public class App {

	public static void main(String[] args) {
	
		DepthFirstSearch dfs = new DepthFirstSearch();
		
		Vertex vertex1 = new Vertex(1);
		Vertex vertex2 = new Vertex(2);
		Vertex vertex3 = new Vertex(3);
		Vertex vertex4 = new Vertex(4);
		Vertex vertex5 = new Vertex(5);
		Vertex vertex6 = new Vertex(6);
		Vertex vertex7 = new Vertex(7);
		Vertex vertex8 = new Vertex(8);
		
		vertex1.addadjacencyList(vertex2);
		vertex1.addadjacencyList(vertex3);
		vertex1.addadjacencyList(vertex4);
		
		vertex2.addadjacencyList(vertex5);
		vertex2.addadjacencyList(vertex6);
		
		vertex4.addadjacencyList(vertex7);
		
		vertex6.addadjacencyList(vertex8);
		
		dfs.dfs(vertex1);

	}

}
