package com.company.algo;

/*
   [5, 9, 11, 12,14,20, 25]
   Lets disconnect,
*/

import java.io.*;
import java.util.*;

/********************************************************
 * CODE INSTRUCTIONS:                                   *
 * 1) The method findInOrderSuccessor you're asked      *
 *    to implement is located at line 36.               *
 * 2) Use the helper code below to implement it.        *
 * 3) In a nutshell, the helper code allows you to      *
 *    to build a Binary Search Tree.                    *
 * 4) Jump to line 103 to see an example for how the    *
 *    helper code is used to test findInOrderSuccessor. *
 ********************************************************/

class Solution {

    static class Node {

        int key;
        Node left;
        Node right;
        Node parent;

        Node(int key) {
            this.key = key;
            left = null;
            right = null;
            parent = null;
        }
    }



    static class BinarySearchTree {

        static Node findMin(Node node){
            Node current = node;
            while(current.left!= null){
                current = current.left;
            }
            return current;
        }

        Node root; // this is the rootNode
        Node newNode = null;
        Node findInOrderSuccessor(Node inputNode) {
            if(inputNode.right != null){
                Node n = inputNode.right;
                while (n.left !=null){
                    n = n.left;
                }
                return n;
            }

            Node p = inputNode.parent;
            while(p!= null && inputNode == p.right){
                inputNode = p;
                p= p.parent;
            }
            return p;

        }

         void insertData(int data){
            Node node = new Node(data);
            if(root ==null){

            }

        }

        //  Given a binary search tree and a number, inserts a new node
        //  with the given number in the correct place in the tree
        void insert(int key) {


            if(root == null){
                root = new Node(key);
                return;
            }
            Node newNode  = new Node(key);
            Node current = root;

            while(current !=null) {
                if (key < current.key) {
                    if(current.left ==null){
                        current.left =newNode;
                        newNode.parent =current;
                        break;
                    }else
                        current = current.left ;
                } else  {
                    if(current.right ==null){
                        current.right =newNode;
                        newNode.parent =current;
                        break;
                    }else
                        current= current.right ;
                }
            }


        }

        // Return a reference to a node in the BST by its key.
        // Use this method when you need a node to test your
        // findInOrderSuccessor method on
        Node getNodeByKey(int key) {
            Node currentNode = this.root;

            while(currentNode != null) {
                if(key == currentNode.key) {
                    return currentNode;
                }

                if(key < currentNode.key) {
                    currentNode = currentNode.left;
                } else {
                    currentNode = currentNode.right;
                }
            }

            return null;
        }
    }



    static void printInOrderTree(Node root){
        if(root == null) return;



       printInOrderTree(root.left);
       System.out.printf("%d ",root.key);
       printInOrderTree(root.right);
    }

    /***********************************************
     * Driver program to test findInOrderSuccessor *
     ***********************************************/

    public static void main(String[] args) {

        Node test = null, succ = null;

        // Create a Binary Search Tree
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(20);
        tree.insert(9);
        tree.insert(25);
        tree.insert(5);
        tree.insert(12);
        tree.insert(11);
        tree.insert(14);

        // Get a reference to the node whose key is 9
        test = tree.getNodeByKey(14);

        printInOrderTree(tree.root);

        // Find the in order successor of test
        succ = tree.findInOrderSuccessor(test);

        // Print the key of the successor node
        if (succ != null) {
            System.out.println("Inorder successor of " + test.key +
                    " is " + succ.key);
        } else {
            System.out.println("Inorder successor does not exist");
        }
    }
}
