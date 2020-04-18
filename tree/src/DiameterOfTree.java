public class DiameterOfTree {

    static int diameterOfBinaryTree(TreeNode root) {
        /* base case if tree is empty */
        if (root == null)
            return 0;
        /* get the height of left and right sub trees */
        int lheight = height(root.left);
        int rheight = height(root.right);

        /* get the diameter of left and right subtrees */
        int ldiameter = diameterOfBinaryTree(root.left);
        int rdiameter = diameterOfBinaryTree(root.right);

        return Math.max(lheight + rheight ,
                Math.max(ldiameter, rdiameter));

    }

    static int height(TreeNode node)
    {
        /* base case tree is empty */
        if (node == null)
            return 0;

        return (1 + Math.max(height(node.left), height(node.right)));
    }

    public static void main(String[] args) {
        TreeNode t = new TreeNode(3);
         t.left = new TreeNode(2);
         t.left.left = new TreeNode(1);
         t.right = new TreeNode(5);
         t.right.left = new TreeNode(4);

        System.out.println(diameterOfBinaryTree(t));
    }
}
