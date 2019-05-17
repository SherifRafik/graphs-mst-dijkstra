package graphs;

import java.util.ArrayList;

public class Vertex {

	private String value;
	private Vertex dijkstraParent;

	public Vertex(String value) {
		this.value = value;
		this.dijkstraParent = null;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Vertex getDijkstraParent() {
		return dijkstraParent;
	}

	public void setDijkstraParent(Vertex dijkstraParent) {
		this.dijkstraParent = dijkstraParent;
	}

	public String shortestPathToString(Double length) {
		ArrayList<String> steps = new ArrayList<>();
		Vertex parent = dijkstraParent;
		steps.add(value);
		while (parent != null) {
			steps.add(0, (parent.getValue() + " => "));
			parent = parent.getDijkstraParent();
		}
		StringBuilder shortestPath = new StringBuilder();
		for (String s : steps) {
			shortestPath.append(s);
		}
		return "Shortest path to " + value + " is:\t" + shortestPath.toString() + "\twith length " + length;
	}

	@Override
	public String toString() {
		return " " + value;
	}

}
