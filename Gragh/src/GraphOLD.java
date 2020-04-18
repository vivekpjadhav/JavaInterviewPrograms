import java.util.*;

public class GraphOLD {

    private Map<String, Node> nodes = new HashMap<>();
    private Map<Node, List<Node>> adjList = new HashMap<>();


    public void addNode(String label) {
        Node node = new Node(label);
        nodes.putIfAbsent(label, node);
        adjList.putIfAbsent(node, new ArrayList<>());
    }

    public void addEdge(String from, String to) {
        Node fromNode = nodes.get(from);
        if (fromNode == null)
            throw new IllegalArgumentException();
        Node toNode = nodes.get(to);
        if (toNode == null)
            throw new IllegalArgumentException();

        adjList.get(fromNode).add(toNode);
    }

    public void removeEdge(String from, String to) {
        Node fromNode = nodes.get(from);
        Node toNode = nodes.get(to);
        if (fromNode == null || toNode == null)
            return;

        adjList.get(fromNode).remove(toNode);

    }

    public void printGraph() {
        adjList.entrySet().stream().forEach(System.out::println);
    }

    public void traversBFS(String root) {
        Node  node = nodes.get(root);
        if(node ==null) return;

        Set<Node> visited = new HashSet<>();
        Queue<Node> que = new ArrayDeque<>();
        que.add(node);
        while(!que.isEmpty()){
            Node currenct = que.remove();
            if(visited.contains(currenct))
                continue;

            System.out.println(currenct);
            visited.add(currenct);

            for(Node n : adjList.get(currenct))
                if(!visited.contains(n))
                    que.add(n);
        }
    }

    public void traversDFS(String root) {
        Node node = nodes.get(root);
        traversDFS(node, new HashSet<>());

    }

    public void traversDFS(Node node, Set<Node> visited) {
        System.out.println(node);
        visited.add(node);
        for (Node n : adjList.get(node))
            if (!visited.contains(n))
                traversDFS(n, visited);

    }

    private class Node {
        String label;

        public Node(String label) {
            this.label = label;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "label='" + label + '\'' +
                    '}';
        }
    }
}
