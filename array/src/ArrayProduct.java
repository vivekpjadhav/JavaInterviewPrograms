import java.util.Arrays;

public class ArrayProduct {
    static  int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] result = new int [n];
        int [] right = new int [n];
        int [] left = new int [n];

        int product =1;
          right[0]=1;
        for(int i = 0 ; i+1 <n ; i++){
          right[i+1] = right[i]*nums[i] ;
        }
        int product2 =1;
        left[n-1] =1;
        for(int i = n-1 ; i >0   ; i--){
            left[i-1] = left[i]*nums[i];
        }

        for (int i = 0; i < result.length ; i++) {
            result[i] = left[i]*right[i];
        }

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(right));
        System.out.println(Arrays.toString(left));
        return result;

    }

    public static void main(String[] args) {
        System.out.println(productExceptSelf(new int []{1,2,3,4}));
        System.out.println(productExceptSelf(new int []{1,0}));
    }
}
