import java.util.ArrayList;
import java.util.List;

public class Vertex<T> {

    long id;
    private T data;
    // every vertex has list = of edges
    private List<Edge<T>> edges = new ArrayList<>();
    private List<Vertex<T>> adjacentVertex = new ArrayList<>();

    public Vertex(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public List<Vertex<T>> getAdjacentVertex() {
        return adjacentVertex;
    }

    public void addAdjacentVertex(Edge<T> e, Vertex<T> v) {
        edges.add(e);
        adjacentVertex.add(v);
    }

    public List<Edge<T>> getEdges() {
        return edges;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vertex)) return false;

        Vertex<?> vertex = (Vertex<?>) o;

        if (id != vertex.id) return false;
        if (getData() != null ? !getData().equals(vertex.getData()) : vertex.getData() != null) return false;
        if (getEdges() != null ? !getEdges().equals(vertex.getEdges()) : vertex.getEdges() != null) return false;
        return getAdjacentVertex() != null ? getAdjacentVertex().equals(vertex.getAdjacentVertex()) : vertex.getAdjacentVertex() == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (getData() != null ? getData().hashCode() : 0);
        result = 31 * result + (getEdges() != null ? getEdges().hashCode() : 0);
        result = 31 * result + (getAdjacentVertex() != null ? getAdjacentVertex().hashCode() : 0);
        return result;
    }
}

class Edge<T>{

    private boolean isDirected = false;
    private Vertex<T> v1;
    private Vertex<T> v2;
    private int weight;

    public Edge( Vertex<T> v1, Vertex<T> v2,boolean isDirected, int weight) {
        this.isDirected = isDirected;
        this.v1 = v1;
        this.v2 = v2;
        this.weight = weight;
    }

    public Edge(boolean isDirected, Vertex<T> v1, Vertex<T> v2) {
        this.isDirected = isDirected;
        this.v1 = v1;
        this.v2 = v2;
    }

    public Edge(Vertex<T> v1, Vertex<T> v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    public boolean isDirected() {
        return isDirected;
    }

    public Vertex<T> getV1() {
        return v1;
    }

    public Vertex<T> getV2() {
        return v2;
    }

    public int getWeight() {
        return weight;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Edge)) return false;

        Edge<?> edge = (Edge<?>) o;

        if (isDirected() != edge.isDirected()) return false;
        if (getWeight() != edge.getWeight()) return false;
        if (getV1() != null ? !getV1().equals(edge.getV1()) : edge.getV1() != null) return false;
        return getV2() != null ? getV2().equals(edge.getV2()) : edge.getV2() == null;
    }

    @Override
    public int hashCode() {
        int result = (isDirected() ? 1 : 0);
        result = 31 * result + (getV1() != null ? getV1().hashCode() : 0);
        result = 31 * result + (getV2() != null ? getV2().hashCode() : 0);
        result = 31 * result + getWeight();
        return result;
    }
}
