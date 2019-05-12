package graphs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Graph {

	private boolean directed = false;
	private HashMap<Vertex, Set<Edge>> map = new HashMap<>();

	public Graph(boolean directed) {
		this.directed = directed;
	}

	public Graph() {
	}

	public void addVertex(Vertex vertex) {
		map.put(vertex, new HashSet<>());
	}

	public void addEdge(Vertex from, Vertex to, double weight) {
		if (!map.containsKey(from) || !map.containsKey(to))
			return;

		Edge edge = new Edge(from, to, weight);
		map.get(from).add(edge);

		if (!directed) {
			Edge edge2 = new Edge(to, from, weight);
			map.get(to).add(edge2);
		}
	}

	public boolean isDirected() {
		return directed;
	}

	public void setDirected(boolean directed) {
		this.directed = directed;
	}

	public HashMap<Vertex, Set<Edge>> getMap() {
		return map;
	}

	public void setMap(HashMap<Vertex, Set<Edge>> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "Graph [map=" + map + "]";
	}

}
