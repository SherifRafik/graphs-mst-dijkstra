package graphs;

public class Edge implements Comparable<Edge> {

	private double weight;
	private Vertex source;
	private Vertex destination;

	public Edge(Vertex source, Vertex destination, double weight) {
		this.source = source;
		this.destination = destination;
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Vertex getSource() {
		return source;
	}

	public void setSource(Vertex source) {
		this.source = source;
	}

	public Vertex getDestination() {
		return destination;
	}

	public void setDestination(Vertex destination) {
		this.destination = destination;
	}

	@Override
	public String toString() {
		return "Edge [weight=" + weight + ", from=" + source + ", to=" + destination + "]";
	}

	@Override
	public int compareTo(Edge e) {
		return (int) (this.weight - e.weight);
	}

	// positive integer, if the current object is greater than the specified object.
	// negative integer, if the current object is less than the specified object.
	// zero, if the current object is equal to the specified object.
}
