
import java.util.HashMap;
import java.util.Set;

import graphs.Edge;
import graphs.Graph;
import graphs.Vertex;

public class Main {

	public static void main(String[] args) {
		Graph g = new Graph();
		Vertex v0 = new Vertex("0");
		Vertex v1 = new Vertex("1");
		Vertex v2 = new Vertex("2");
		Vertex v3 = new Vertex("3");
		Vertex v4 = new Vertex("4");
		Vertex v5 = new Vertex("5");
		Vertex v6 = new Vertex("6");
		Vertex v7 = new Vertex("7");
		Vertex v8 = new Vertex("8");
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

		HashMap<Vertex, Set<Edge>> test = g.getMap();
		for (Vertex name : test.keySet()) {
			String key = name.toString();
			String value = test.get(name).toString();
			System.out.println(key + " " + value);
		}
	}

}
