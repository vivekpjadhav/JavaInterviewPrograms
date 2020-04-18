public class SameTreeTest {

    public boolean sameTree(Node root1 , Node root2 ){
        if(root1 == null && root2 == null ) return true;

        if(root1 == null || root2 == null ) return false;

        return (root1.key == root2.key) &&   sameTree(root1.left,root2.left) &&
        sameTree(root1.right,root2.right);


    }
    public int heightOfTree(Node root){
        if(root == null) return 0;

        int lh = heightOfTree(root.left);
        int rh = heightOfTree(root.right);

        return Math.max(lh,rh)+1;

    }
    public int sizeOfTree(Node root){
        if(root == null) return 0;

        int lh = sizeOfTree(root.left);
        int rh = sizeOfTree(root.right);

        return 1+ lh +rh;

    }

    boolean rootToLeafSum(Node root ,int sum){
        if(root ==null) return false;

        if(root.left == null && root.right ==null){
            if(root.key == sum ) return true;
            else return false;

        }
        if(rootToLeafSum(root.left,sum- root.key)){
            return true;
        }
        if(rootToLeafSum(root.right,sum- root.key)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {





    }



}
