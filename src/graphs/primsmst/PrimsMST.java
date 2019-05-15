package graphs.primsmst;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;

import graphs.Edge;
import graphs.Graph;
import graphs.Vertex;

public class PrimsMST {

	Graph graph;
	private int totalCost;

	public PrimsMST(Graph g) {
		this.graph = g;
		totalCost = 0;
	}

	public ArrayList<Edge> getMST(Vertex start) {
		ArrayList<Edge> edges = new ArrayList<Edge>();

		if (start == null)
			return edges;

		// Set of all verticies that are in the mst
		Set<Vertex> mst = new HashSet<>();
		mst.add(start);

		PriorityQueue<Edge> queue = new PriorityQueue<>();
		queue.addAll(graph.getMap().get(start));

		while (!queue.isEmpty()) {
			Edge minEdge = queue.remove();
			Vertex minEdgeVertex = minEdge.getDestination();
			if (mst.contains(minEdgeVertex))
				continue;
			totalCost += minEdge.getWeight();
			mst.add(minEdgeVertex);
			queue.addAll(graph.getMap().get(minEdgeVertex));
			edges.add(minEdge);
		}

		return edges;
	}

	private Vertex getRandomVertex() {
		ArrayList<Vertex> verticies = new ArrayList<>(graph.getMap().keySet());
		int randomIndex = new Random().nextInt(verticies.size());
		Vertex randomVertex = verticies.get(randomIndex);
		return randomVertex;
	}

	public Graph getGraph() {
		return graph;
	}

	public void setGraph(Graph graph) {
		this.graph = graph;
	}

	public int getTotalCost() {
		return totalCost;
	}

}
