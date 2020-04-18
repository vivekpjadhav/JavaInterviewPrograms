package com.company.algo;

public class ArrayEliment {
    public static void main(String[] args) {
        int[] arr = {-8, 0, 2, 5};
        System.out.println(indexEqualsValueSearch(arr));

    }

    static int indexEqualsValueSearch(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int result = -1;

        while (start <= end) {
           // int mid = Math.abs((start + end) / 2);
            int mid = (start + (end - start)/2);
            if (arr[mid] < mid) {
                start = mid + 1;
            } else if (arr[mid] > mid) {
                end = mid - 1;
            } else {
                result = mid;
                end = mid - 1;
            }
        }


    return result;
}


//    static int indexEqualsValueSearch(int[] arr) {
//        int result = -1;
//        int start = 0 ;
//        int end = arr.length -1;
//
//        while (start <= end) {
//            int mid = (start + (end - start)/2);
//            if (arr[mid] == mid) {
//                result = mid;
//                end = mid - 1;
//            } else if (arr[mid] > mid) {
//                end = mid -1;
//            } else {
//                start = mid + 1;
//            }
//        }
//
//        return result;
//    }


}
