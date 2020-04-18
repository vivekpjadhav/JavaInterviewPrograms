public class SalesPath {
    static int getCheapestCost(Node root) {

        int sum = 0;

        if (root == null) {
            return 0;
        }
        if (root.children == null) {
            return root.cost;
        }
        int minCost = Integer.MAX_VALUE;
        sum = sum + root.cost;
        for (Node n : root.children) {
            sum = getCheapestCost(n);
            minCost = Math.min(sum, minCost);
            System.out.println("mis cost in side the loop "+minCost);
        }
        System.out.println(minCost +root.cost);
        return minCost + root.cost;

    }

    public static void main(String[] args) {

        Node node0 = new Node(0);
        Node node00 = new Node(0);
        Node node5 = new Node(5);
        Node node55 = new Node(5);
        Node node4 = new Node(4);
        Node node3 = new Node(3);
        Node node6 = new Node(7);
        Node node2 = new Node(2);
        Node node11 = new Node(1);
        Node node1 = new Node(1);
        Node node111 = new Node(1);
        Node node10 = new Node(10);

        node0.children = new Node[]{node5, node3, node6};
        node5.children = new Node[]{node4};
        node3.children = new Node[]{node2, node00};
        node6.children = new Node[]{node1, node55};
        node2.children = new Node[]{node11};
        node11.children = new Node[]{node111};
        node00.children = new Node[]{node10};

        System.out.println(getCheapestCost(node3));


    }

    static class Node {

        int cost;
        Node[] children;
        Node parent;
        Node(int cost) {
            this.cost = cost;
            children = null;
            parent = null;
        }
    }


}
