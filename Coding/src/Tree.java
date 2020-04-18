class Node{
    int data;
    Node left;
    Node right;
    Node parent;

    public Node(int data) {
        this.data = data;
        left=right=parent=null;
    }
}

public class Tree {
    Node root;

    public Tree() {
        this.root = null;
    }

    public void insert(int  data){
        Node newNode = new Node(data);
        if(root == null){
            root = newNode;
            return;
        }
        Node current = root;
        while(current != null){
            if(data < current.data){
                if(current.left == null) {
                    current.left = newNode;
                    current.parent = current;
                    break;
                }
                current = current.left;
            }
            else {
                if(current.right == null) {
                    current.right = newNode;
                    current.parent = current;
                    break;
                }
                current = current.right;
            }
        }

    }

    static void printTree(Node root){

        if(root == null){
            return;
        }
        System.out.printf(" %d -",root.data);
        printTree(root.left);
        printTree(root.right);


    }

    static int hight(Node root){

        if(root == null)
            return 0 ;
        else{
            int lhight =hight(root.left);
            int rhight =hight(root.right);

            return 1+Math.max(lhight,rhight);
        }
    }



    public static void main(String[] args) {

        Tree tree = new Tree();
        tree.insert(12);
        tree.insert(13);
        tree.insert(9);
        tree.insert(14);
        tree.insert(23);
        tree.insert(21);
        tree.insert(20);
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        printTree(tree.root);
        System.out.println("------");
        System.out.println(hight(tree.root));

    }
}
