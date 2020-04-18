import java.util.*;

public class Graph<T> {

    private List<Edge<T>> allEdges ;
    private Map<Long,Vertex<T>> allVertex ;
    boolean isDirected = false;


    public Graph(boolean isDirected) {
        this.isDirected = isDirected;
        allEdges = new ArrayList<>();
        allVertex = new HashMap<>();
    }

    public void addVertex(Vertex<T> vertex){
    if(allVertex.containsKey(vertex.getId())){
        return ;
    }
    allVertex.put(vertex.getId(),vertex);

    for (Edge<T> e:vertex.getEdges()){
        allEdges.add(e);
    }

    }

    public void addEdge(long id1 ,long id2){
        addEdge(id1,id2,0);
    }
    public void addEdge(long id1 ,long id2,int weight){

        Vertex<T> v1 = null;
        if(allVertex.containsKey(id1)){
            v1 = allVertex.get(id1);
        }else{
            v1 = new Vertex<>(id1);
            allVertex.put(id1,v1);
        }
        Vertex<T> v2 = null;
        if(allVertex.containsKey(id1)){
            v2 = allVertex.get(id1);
        }else{
            v2 = new Vertex<>(id1);
            allVertex.put(id1,v1);
        }
        Edge<T> edge = new Edge<T>(v1,v2,isDirected,weight);
        allEdges.add(edge);
        v1.addAdjacentVertex(edge,v2);
        if(!isDirected){
            v2.addAdjacentVertex(edge,v1);
        }
    }

    public List <Edge<T>> getAllEdges(){
        return allEdges;
    }

    public Collection<Vertex<T>> getAllVertex(){
        return allVertex.values();
    }

    public void setDataForVertex(long id,T data){
        if(allVertex.containsKey(id)){
            Vertex<T> vertex = allVertex.get(id);
            vertex.setData(data);
        }

    }


    @Override
    public String toString(){
        StringBuffer buffer = new StringBuffer();
        for(Edge<T> edge : getAllEdges()){
            buffer.append(edge.getV1() + " " + edge.getV2() + " " + edge.getWeight());
            buffer.append("\n");
        }
        return buffer.toString();
    }
}
