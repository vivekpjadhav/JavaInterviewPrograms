package com.company.algo;

public class BinarySearchRecursive {

        static boolean binarySearch(int[] arr , int value , int start ,int end){
            if(start <= end) {
                int mid = (start + end) / 2;

                if(arr[mid]== value) return true;
                if(arr[mid] < value) return binarySearch(arr,value,mid+1,end);
                if(arr[mid] > value) return binarySearch(arr,value,start,mid-1);

            }
            return false;

        }
    public static void main(String[] args) {

String s="kk";


BinarySearchRecursive binarySearch = new BinarySearchRecursive();
        int [] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(binarySearch.binarySearch(arr,7,0,arr.length ));
        System.out.println(binarySearch.binarySearch(arr,0,0,arr.length ));
    }
}
