/**
 * T  O(n)
 * S  o(h)
 */
public class LCATree {

    public static void main(String[] args) {
        TreeNode t = new TreeNode(1);
        t.left = new TreeNode(2);
        t.left.left = new TreeNode(4);
        t.left.right = new TreeNode(5);
        t.right = new TreeNode(3);
        t.right.left = new TreeNode(6);
        t.right.right = new TreeNode(7);
        System.out.println(lca(t,t.left.left,t.right.right));
        System.out.println(LCA(t,t.left.left,t.right.right));
    }

    static TreeNode LCA(TreeNode root, TreeNode T1 ,TreeNode T2){
        if(root ==null){
            return null;
        }

        if(root.val > T1.val && T2.val < root.val ){
            return LCA(root.left ,T1,T2);
        }else  if(root.val > T1.val && T2.val < root.val ){
            return LCA(root.right,T1,T2);
        }
        else{
            return root;
        }
    }

    static TreeNode lca(TreeNode root, TreeNode n1, TreeNode n2) {
            if(root== null )
                return null;

            if(root == n1 || root == n2)
                return root;

            TreeNode left = lca(root.left, n1,n2);
            TreeNode right = lca(root.right, n1,n2);

            if(left!= null && right != null)
                return root;

            return (left!= null)? left:right;
    }
}
