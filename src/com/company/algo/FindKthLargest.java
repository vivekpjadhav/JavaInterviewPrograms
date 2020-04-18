package com.company.algo;

import com.sun.security.jgss.GSSUtil;

import java.util.PriorityQueue;

public class FindKthLargest {
    static int findKthLargest(int[] arr , int k){

        PriorityQueue<Integer> pq = new PriorityQueue<>(k);
        for (int i:arr) {
            pq.offer(i);

            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }


    public static void main(String[] args) {

        int[] arr = {1,2,3,45,234,100,7,90};
        System.out.println(findKthLargest(arr,5));

    }
}
