package dfs;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	
	private int data;
	private boolean visited;
	private List <Vertex> adjecencyList;
	
	public Vertex(int data){
		this.data = data;
		adjecencyList = new ArrayList<>();
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public List<Vertex> getAdjecencyList() {
		return adjecencyList;
	}

	public void setAdjecencyList(List<Vertex> adjecencyList) {
		this.adjecencyList = adjecencyList;
	}
	
	public void addadjacencyList(Vertex v){
		adjecencyList.add(v);
	}
	

}
