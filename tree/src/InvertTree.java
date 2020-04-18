public class InvertTree {
    public static void main(String[] args) {

    }
    public static void invertBinaryTree(BinaryTree tree) {
        // Write your code here.
        if(tree == null) return;

        swap(tree);
        invertBinaryTree(tree.left);
        invertBinaryTree(tree.right);
    }

    public static void swap(BinaryTree tree){
        BinaryTree temp = tree.left;
        tree.left =tree.right;
        tree.right = temp;
    }

    static class BinaryTree {
        public int value;
        public BinaryTree left;
        public BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

}
