import java.util.Arrays;

public class MinNumJumps {

    /**
     * if(i <= j+input[i])
     * T[i] = min(T[i],T[j-1])
     */

    public  static int minJumps(int[] arr){
      int[] jump = new int [arr.length];
      Arrays.fill(jump,Integer.MAX_VALUE);
      jump[0]=0;

        for (int i = 1; i < arr.length ; i++) {
            for (int j = 0; j < i  ; j++) {
                if(i <= arr[j]+j){
                    if (jump[i] > jump[j]+1){
                        jump[i]= jump[j]+1;
                    }
                }
            }
        }
        return jump[jump.length-1];

    }

    public static void main(String[] args) {
        int arr[] = {2,3,1,1,2,4,2,0,1,1};
        int r[] = new int[arr.length];
        int result = minJumps(arr);
        System.out.println(result);
    }
}
