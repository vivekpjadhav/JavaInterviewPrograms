import java.util.Arrays;

public class ArrayQuadruplet {


    static int[] moveZerosToEnd(int[] arr) {
        // your code goes here
        int n = arr.length;
        int j =1;
        int i=0;
        while(j < n ){
            if(arr[i] ==0 && arr[j] != 0){
                swap(arr,i++,j++);
            }else if(arr[i] ==0 && arr[j] ==0){
                j++;
            }else{
                i++;
                j++;
            }

        }
        return arr;
    }

    static void swap(int[]arr ,int i,int j){
        int temp = arr[i];
        arr[i] =arr[j];
        arr[j] =temp;
    }
    public static int[] arrayQuadruplet(int[] arr,int s) {
        int n = arr.length;
        int result = 0;
        if(n < 4) return new int[]{};

        for (int i = 0; i <= n-4 ; i++) {
            for (int j = i+1; j <= n-3 ; j++) {

                result = s - (arr[i] + arr[j]);
                int low = j+1;
                int high = n-1;
                while(low< high){
                    if(arr[low] + arr[high] < result) {
                        low++;
                    }else if(arr[low] + arr[high] > result) {
                        high--;
                    }else
                         return new int[]{arr[i],arr[j],arr[low],arr[high]};
                }
            }

        }
        return new int[]{};

    }


    public static void main(String[] args) {
     //   int arr[] =  new int []{2, 7, 4, 0, 9, 5, 1, 3};

       // System.out.println(Arrays.toString(arrayQuadruplet(arr,20)));

        System.out.print(Arrays.toString(moveZerosToEnd(new int[]{1, 10, 0, 2, 8, 3, 0, 0, 6, 4, 0, 5, 7, 0})));
    }


}
