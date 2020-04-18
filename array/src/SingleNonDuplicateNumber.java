import java.util.*;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class SingleNonDuplicateNumber {

    public static int singleNumber(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();
        for(int i= 0; i < nums.length ; i++){
            int value  = map.getOrDefault(nums[i],0);
            map.put(nums[i],++value);

        }

      // return (int) map.entrySet().stream().filter(n->n.getValue()==1).map(n->n.getKey()).collect(Collectors.toList()).get(0);
        Iterator it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry a = (Map.Entry) it.next();

        }
        return 1;
    }

    public static void main(String[] args) {
        int [] data = new int []{4,1,2,1,2};
        System.out.println(singleNumber(data));

        List<Integer> list = new ArrayList<>();
        //list.add(1);
      //  list.add(2);
        int [] r = new int[list.size()];
        Arrays.setAll(r,list::get);

        System.out.println(Arrays.toString(r));
    }

}
