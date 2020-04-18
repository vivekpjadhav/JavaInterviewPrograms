package graph;

import java.util.LinkedList;
import java.util.List;

public class ListOfDepth {

    public static void main(String[] args) {
        TreeNode node = MinimalTree.MinimalTree(new int[] {1,2,3,4,5,6,7,8,9,10});
        System.out.println(balanceBinaryTree(node));
    }

    static boolean balanceBinaryTree(TreeNode root){
        if(root ==null)
            return false;
        int left = hight(root.left);
        int right = hight(root.right);

        System.out.println(left+":-----left----right----:"+right);

        return (Math.abs(left-right) <=1);
    }

    static int hight(TreeNode root){
         if(root == null)
             return 0;

         int left = hight(root.left);
         int right = hight(root.right);

         return 1+Math.max(left,right);


    }

    static List<List<TreeNode>> listOfDepth(TreeNode root){
        List<List<TreeNode>> result = new LinkedList<>();

        List<TreeNode> current = new LinkedList<>();

       if(root != null)
           current.add(root);

       while(current.size()>0){
           result.add(current);
           List<TreeNode> parent = current;
           current = new LinkedList<>();

           for (TreeNode node:parent){

               if(node.left!=null)
                   current.add(node.left);
               if(node.right != null)
                   current.add(node.right);
           }

       }
       return result;




    }
}
