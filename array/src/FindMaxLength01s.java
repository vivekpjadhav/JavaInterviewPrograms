import java.util.HashMap;
import java.util.Map;

public class FindMaxLength01s {

    public static void main(String[] args) {
        System.out.println(findMaxLength( new  int []{1,0,1}));
    }

    static int findMaxLength(int[] arr) {
        int count = 0, max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            count += (arr[i] == 1) ? 1 : -1;

            if (count == 0)
                max = Math.max(max, i + 1);

            if (map.containsKey(count)) {
                max = Math.max(max, i - map.get(count));
            }else{
                map.put(count,i);
            }

        }
        return max;
    }



}
