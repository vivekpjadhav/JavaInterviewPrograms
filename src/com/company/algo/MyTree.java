package com.company.algo;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}


public class MyTree {
    TreeNode root;

    public MyTree() {
        this.root = null;
    }

    public void insertNode(int data) {
        TreeNode treeNode = new TreeNode(data);

        if (root == null) {
            root = treeNode;
            return;
        }
        TreeNode current = root;
        while (true) {

            if (data < current.data) {
                if (current.left == null) {
                    current.left = treeNode;
                    break;
                }
                current = current.left;

            } else {
                if (current.right == null) {
                    current.right = treeNode;
                    break;
                }
                current = current.right;
            }

        }

    }


    public int hightOfTheTree() {
        return hightOfTheTree(root);

    }

//    private int hightOfTheTree(TreeNode root) {
//        if(root == null) return -1;
//        if(root.right==null && root.left ==null) return 0;
//
//        return 1+Math.max(hightOfTheTree(root.left),hightOfTheTree(root.right));
//
//    }


    private int hightOfTheTree(TreeNode root) {
        if (root == null) return -1;
        if (root.left == null && root.right == null) return 0;
        return 1 + Math.max(hightOfTheTree(root.left), hightOfTheTree(root.right));
    }

    public static void main(String[] args) {
        MyTree tree = new MyTree();
        tree.insertNode(1);
        tree.insertNode(2);
        tree.insertNode(3);
        tree.insertNode(4);
        System.out.println(tree.hightOfTheTree());


    }

}
