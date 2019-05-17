package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Graph {

	private boolean directed;
	private HashMap<Vertex, Set<Edge>> map = new HashMap<>();
	private ArrayList<Edge> edges = new ArrayList<>();

	public Graph(boolean directed) {
		this.directed = directed;
	}

	public void addVertex(Vertex vertex) {
		map.put(vertex, new HashSet<>());
	}

	public void addEdge(Vertex source, Vertex destination, double weight) {
		if (!map.containsKey(source) || !map.containsKey(destination))
			return;

		// TODO: check if edge already exists

		Edge edge = new Edge(source, destination, weight);
		map.get(source).add(edge);
		edges.add(edge);

		if (!directed) {
			Edge edge2 = new Edge(destination, source, weight);
			map.get(destination).add(edge2);
			edges.add(edge2);

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

	public Set<Vertex> getVertices() {
		return new HashSet<>(map.keySet());
	}

	@Override
	public String toString() {
		return "Graph [map=" + map + "]";
	}

	public ArrayList<Edge> getEdges() {
		return edges;
	}
	
	public Set<Edge> getEdges(Vertex source) {
		return map.get(source);
	}

	public void setEdges(ArrayList<Edge> edges) {
		this.edges = edges;
	}

}
