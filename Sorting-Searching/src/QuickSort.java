import java.util.Arrays;

public class QuickSort {


    public static void sort(int[] array, int left, int right) {
        if(left<right) {
            int partition = partition(array, left, right);

            sort(array, left, partition - 1);
            sort(array, partition + 1, right);
        }
    }

    private static int partition(int[] array, int left, int right) {
    int pivot = array[right];
    int i = left -1;
        for (int j = left; j <right ; j++) {
            if(array[j]<=pivot) {
                i++;
                swap(array, i, j);
            }

        }

        swap(array,i+1,right);
        return i+1;

    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2,4, 2, 125, 6, 7, 324, 2, 23};
        int end = array.length - 1;
        int start = 0;
        sort(array, start, end);
        System.out.println(Arrays.toString(array));
    }

}
