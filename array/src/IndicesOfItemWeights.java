import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IndicesOfItemWeights {


    static int[] getIndicesOfItemWeights(int[] arr, int limit) {
        // your code goes here
        Map<Integer,Integer> limitMap = new HashMap<>();

        for(int i = 0 ; i < arr.length ;i++){
            int value = arr[i];
            if(limitMap.containsKey(limit-value)){
                return new int[]{i,limitMap.get(limit-value)};
            }else
                limitMap.put(value,i);


        }

        return null;


    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 10, 15, 16};

        System.out.println(Arrays.toString(getIndicesOfItemWeights(arr,21)));

    }


}
