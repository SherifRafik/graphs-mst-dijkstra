package main;

import java.util.HashMap;

import graphs.Graph;
import graphs.Vertex;
import graphs.shortestpath.Dijkstra;

public class Main {

	public static void main(String[] args) {
		//Undirected Graph
		Graph g = new Graph();
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
		
		//Directed Graph
//		Graph g = new Graph(true);
//		Vertex a = new Vertex("A");
//		Vertex b = new Vertex("B");
//		Vertex c = new Vertex("C");
//		Vertex d = new Vertex("D");
//		g.addVertex(a);
//		g.addVertex(b);
//		g.addVertex(c);
//		g.addVertex(d);
//		g.addEdge(a, b, 4.0);
//		g.addEdge(a, c, 6.0);
//		g.addEdge(b, c, 1.0);
//		g.addEdge(d, c, 2.0);
//		g.addEdge(b, d, 5.0);



//		HashMap<Vertex, Set<Edge>> test2 = g.getMap();
//		for (Vertex name : test2.keySet()) {
//		String key = name.toString();
//	    String value = test2.get(name).toString();
//		System.out.println(key + " " + value);
//		 }

//		PrimsMST mst = new PrimsMST(g);
//		ArrayList<Edge> edges = mst.getMST();
//		for (Edge e : edges) {
//			System.out.println(e);
//		}
//		System.out.println(mst.getTotalCost());

		Dijkstra vanDijk = new Dijkstra(g);
		HashMap<Vertex, Double> test = vanDijk.shortestPath(v0);
		for (Vertex name : test.keySet()) {
			String key = name.toString();
			String value = test.get(name).toString();
			System.out.println(key + " " + value);
		}

	}

}
