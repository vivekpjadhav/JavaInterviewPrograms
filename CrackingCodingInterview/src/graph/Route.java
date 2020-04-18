package graph;

import java.util.*;

class DirectedGraph {
    String Name;
    List<DirectedGraph> neighbors;

    public DirectedGraph(String name) {
        Name = name;
        neighbors = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "DirectedGraph{" +
                "Name='" + Name + '\'' +
                ", neighbors=" + neighbors +
                '}';
    }
}

public class Route {

    public static void main(String[] args) {
        DirectedGraph A = new DirectedGraph("A");

        DirectedGraph B = new DirectedGraph("B");
        DirectedGraph C = new DirectedGraph("C");
        DirectedGraph D = new DirectedGraph("D");
        DirectedGraph E = new DirectedGraph("E");
        A.neighbors.add(B);
        A.neighbors.add(D);
        B.neighbors.add(C);
        B.neighbors.add(D);
        D.neighbors.add(E);


        Route route = new Route();
        System.out.println(route.bfs(Arrays.asList(A, B, C, D, E), B, E));
        System.out.println(route.bfs(Arrays.asList(A, B, C, D, E), D, C));
        System.out.println(route.hasRoute(Arrays.asList(A, B, C, D, E), B, E));
        System.out.println(route.hasRoute(Arrays.asList(A, B, C, D, E), D, C));

    }

    /**
     * This is problems is to solve the route between nodes
     */

    public boolean hasRoute(List<DirectedGraph> graph, DirectedGraph s, DirectedGraph t) {

        return dfs(s, t, new HashSet<DirectedGraph>());
    }


    public boolean dfs(DirectedGraph s, DirectedGraph t, Set<DirectedGraph> visited) {

        if (s == t)
            return true;
        visited.add(s);
        for (DirectedGraph graph : s.neighbors) {
            if (!visited.contains(graph)) {
                if (dfs(graph, t, visited))
                    return true;
            }
        }

        return false;

    }

    public boolean bfs(List<DirectedGraph> nodes, DirectedGraph source, DirectedGraph target) {

        if (source == target)
            return true;
        Queue<DirectedGraph> queue = new LinkedList<>();
        Set<DirectedGraph> set = new HashSet<>();
        queue.add(source);
        set.add(source);
        while (!queue.isEmpty()) {
            DirectedGraph graph = queue.poll();
            for (DirectedGraph a : graph.neighbors) {
                if (a == target)
                    return true;

                if (!set.contains(a)) {
                    queue.add(a);
                    set.add(a);
                }
            }
        }
        return false;

    }


}
