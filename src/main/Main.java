package main;

import java.util.ArrayList;
import java.util.HashMap;

import graphs.Edge;
import graphs.Graph;
import graphs.Vertex;
import graphs.primsmst.PrimsMST;
import graphs.shortestpath.Dijkstra;

public class Main {

	public static void main(String[] args) {
		// Undirected Graph
		Graph g = new Graph(false);
		Vertex v0 = new Vertex("a");
		Vertex v1 = new Vertex("b");
		Vertex v2 = new Vertex("c");
		Vertex v3 = new Vertex("d");
		Vertex v4 = new Vertex("e");
		Vertex v5 = new Vertex("f");
		Vertex v6 = new Vertex("g");
		Vertex v7 = new Vertex("h");
		Vertex v8 = new Vertex("i");
		g.addVertex(v0);
		g.addVertex(v1);
		g.addVertex(v2);
		g.addVertex(v3);
		g.addVertex(v4);
		g.addVertex(v5);
		g.addVertex(v6);
		g.addVertex(v7);
		g.addVertex(v8);
		g.addEdge(v0, v1, 4.0);
		g.addEdge(v0, v7, 8.0);
		g.addEdge(v1, v7, 11.0);
		g.addEdge(v1, v2, 8.0);
		g.addEdge(v7, v8, 7.0);
		g.addEdge(v7, v6, 1.0);
		g.addEdge(v2, v3, 7.0);
		g.addEdge(v2, v5, 4.0);
		g.addEdge(v2, v8, 2.0);
		g.addEdge(v8, v6, 6.0);
		g.addEdge(v6, v5, 2.0);
		g.addEdge(v3, v4, 9.0);
		g.addEdge(v3, v5, 14.0);
		g.addEdge(v5, v4, 10.0);
		
		PrimsMST mst = new PrimsMST(g);
		ArrayList<Edge> edges = mst.getMST(v0);
		for (Edge edge : edges) {
			System.out.println(edge);
		}
		System.out.println(mst.getTotalCost());


//		 Directed Graph
		 Graph g2 = new Graph(true);
		 Vertex a = new Vertex("A");
		 Vertex b = new Vertex("B");
		 Vertex c = new Vertex("C");
		 Vertex d = new Vertex("D");
		 g2.addVertex(a);
		 g2.addVertex(b);
		 g2.addVertex(c);
		 g2.addVertex(d);
		 g2.addEdge(a, b, 4.0);
		 g2.addEdge(a, c, 6.0);
		 g2.addEdge(b, c, 1.0);
		 g2.addEdge(d, c, 2.0);
		 g2.addEdge(b, d, 5.0);

		Dijkstra dijkstra = new Dijkstra(g2);
		HashMap<Vertex, Double> map = dijkstra.shortestPath(a);
		for (Vertex name : map.keySet()) {
			System.out.println(name.shortestPathToString(map.get(name)));
		}

	}

}
