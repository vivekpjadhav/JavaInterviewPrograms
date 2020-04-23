import java.util.Arrays;

public class MoveZeroToEnd {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZeros(new int[]{1,0,0,2,5,0,2})));
    }
    static void swap(int[]arr , int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j] =temp;
    }

    static int[] moveZeros(int[] arr){
        int i = 0, j =1;
       while(j < arr.length ){
           if(arr[i] ==0  && arr[j]!=0){
               swap(arr,i,j);
               i++;j++;
           }else if(arr[i] ==0  && arr[j]==0){
               j++;
           }else{
               i++;j++;
           }

       }
        return arr;
    }

}
