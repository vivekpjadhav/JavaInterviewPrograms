package com.company.algo;

import java.util.Arrays;



public class QuickSort {


    public static void main(String args[]) {
        QuickSort quickSort = new QuickSort();
        int[] numbers = new int[]{2, 5, 7, 2, 4, 2, 8, 1, 0, 9, 3, 6};
        quickSort.quickSort(numbers, 0, numbers.length - 1);
        System.out.println(Arrays.toString(numbers));
    }

    private void quickSort(int[] numbers, int start, int end) {
      if(start>=end) return;
      int partition = partition(numbers,start,end);

      quickSort(numbers,start,partition-1);
      quickSort(numbers,partition+1,end);


    }

    private int partition(int[] numbers, int start, int end) {
            int pivot = numbers[end];
            int boundry = start -1;
        for (int i = start; i <=end ; i++) {
            if(numbers[i] <= pivot){
                swap(numbers,i,++boundry);
            }

        }
        return boundry;
    }
    private void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }


}
