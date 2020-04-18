
import java.util.*;


public class AbsSort {


    public static void main(String[] args) {

        int [] arr = new int[]{2, -7, -2, -2, 0};
    Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


    }


    static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    static int[] absSort(int[] arr) {
        // your code goes here
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < n; j++) {
                if ((Math.abs(arr[j]) < Math.abs(arr[i])) && (arr[j] > 0)) {

                    swap(arr, i, j);
                } else if (Math.abs(arr[j]) < Math.abs(arr[i]) && arr[j] < 0) {
                    // int one = (arr[i] < 0 && arr[j] >0) ? arr[i] :(arr[i] > 0 && arr[j] <0)? arr[j]: 0;
                    swap(arr, i, j);
                }
                return arr;


            }
        }
        return arr;

    }
}

