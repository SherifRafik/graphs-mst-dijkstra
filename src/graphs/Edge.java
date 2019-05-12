package graphs;

public class Edge implements Comparable<Edge> {

	private double weight;
	private Vertex from;
	private Vertex to;

	public Edge(Vertex from, Vertex to, double weight) {
		this.from = from;
		this.to = to;
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Vertex getFrom() {
		return from;
	}

	public void setFrom(Vertex from) {
		this.from = from;
	}

	public Vertex getTo() {
		return to;
	}

	public void setTo(Vertex to) {
		this.to = to;
	}

	@Override
	public String toString() {
		return "Edge [weight=" + weight + ", from=" + from + ", to=" + to + "]";
	}

	@Override
	public int compareTo(Edge e) {
		return (int) (this.weight - e.weight);
	}

}
