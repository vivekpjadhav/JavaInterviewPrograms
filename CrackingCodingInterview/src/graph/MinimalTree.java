package graph;



public class MinimalTree {

    static TreeNode MinimalTree(int [] arr){
        int start = 0;
        int end = arr.length-1;

        return createTree(arr,start,end);
    }

    private static TreeNode createTree(int[] arr, int start, int end) {

        if(start > end){
            return null;
        }

        int mid = (start+end)/2;
        TreeNode result = new TreeNode(arr[mid]);
        result.left = createTree(arr,start,mid-1);
        result.right = createTree(arr,mid+1,end);
        System.out.println(result.val);
        return result;

    }

    public static void main(String[] args) {
        System.out.println(MinimalTree(new int[] {1,2,3,4,5,6,7,8,9,10}));
    }



}
