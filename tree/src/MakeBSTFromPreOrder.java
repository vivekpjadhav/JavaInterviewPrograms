public class MakeBSTFromPreOrder {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
       TreeNode n = bstFromPreorder(new  int []{8,5,1,7,10,12});
        //TreeNode n = BSTFromPreorder(new  int []{8,5,1,7,10,12});
        System.out.println(n);
    }




    static  TreeNode build(TreeNode root ,int val){
        if(root==null)
            root = new TreeNode(val);
        else if(root.val > val){
            root.left = buildBST(root.left,val);}
        else {
            root.right = buildBST(root.right, val);
        }
        return root;

    }

    static  TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = null;
        for(int x : preorder){
            root=  buildBST(root,x);
        }
        return root;

    }


    static  TreeNode buildBST(TreeNode root ,int val){
        if(root==null)
            root = new TreeNode(val);
        else if(root.val > val){
           root.left = buildBST(root.left,val);}
        else {
            root.right = buildBST(root.right, val);
        }
        return root;

    }
}
