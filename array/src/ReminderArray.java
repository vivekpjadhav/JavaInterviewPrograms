import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class ReminderArray {
    /**
     * [2,7,4,1,8,1]
     * 1 1 2 4 7 8
     * @param stones
     * @return
     */
    static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> list = new PriorityQueue<>((e,f)->{
        return f-e;
        });

        for(int a : stones)
            list.add(a);

        while(list.size() > 1){
            int a = list.remove();
            int b = list.remove();

            if(a!=b){
                list.add(a-b);
            }
        }
        return (!list.isEmpty()) ? list.remove():0;
    }


    public static void main(String[] args) {
       // System.out.println(lastStoneWeight(new int[]{2,7,4,1,8,1}));
        System.out.println(lastStoneWeight(new int[]{9,3,2,10}));
    }
}
