/**
 * Definition for a binary tree node.
 */
class TreeNode {

     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }

    @Override
    public String toString() {
        return "TreeNode: " +
                "val=" + val ;
    }
}

public class FindSumInTree {

        public boolean findTarget(TreeNode root, int k) {

            if(root ==null) return false;

            int diff = k - root.val;

                if(diff != root.val) {

                    if (root.left != null) {
                        findTarget(root.left, k);
                    } else
                        findTarget(root.right, k);

                }else
                  return true;

                return false;

        }



}
