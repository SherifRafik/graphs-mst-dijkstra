package graphs.shortestpath;

import java.util.ArrayList;
import java.util.HashMap;

import graphs.Edge;
import graphs.Graph;
import graphs.Vertex;

public class Dijkstra {

	private Graph graph;

	public Dijkstra(Graph g) {
		this.graph = g;
	}

	public HashMap<Vertex, Double> shortestPath(Vertex source) {
		HashMap<Vertex, Double> distance = new HashMap<>();
		ArrayList<Vertex> vertices = new ArrayList<>();

		for (Vertex vertex : graph.getVertices()) {
			vertex.setDijkstraParent(null);
			if (source.equals(vertex))
				distance.put(source, 0d);
			else
				distance.put(vertex, Double.POSITIVE_INFINITY);
			vertices.add(vertex);
		}

		while (!vertices.isEmpty()) {

			Vertex minimum = null;
			double minimumDistance = Double.POSITIVE_INFINITY;

			for (Vertex vertex : vertices) {
				if (minimumDistance > distance.get(vertex)) {
					minimumDistance = distance.get(vertex);
					minimum = vertex;
				}
			}
			vertices.remove(minimum);

			for (Edge edge : graph.getEdges(minimum)) {
				double newPath = distance.get(minimum) + edge.getWeight();
				if (distance.get(edge.getDestination()) > newPath) {
					edge.getDestination().setDijkstraParent(edge.getSource());
					distance.put(edge.getDestination(), newPath);
				}
			}
		}
		return distance;
	}
}
