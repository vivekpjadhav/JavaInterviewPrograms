import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveToEnd {


    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        // Write your code here.
        int end  = array.size()-1;
        int start = 0;
        List<Integer> newList = new ArrayList<>();

        for(int i =0 ; i < end ; i++){
            while((i<end && array.get(end)==toMove))
                end --;
            if(array.get(i) ==toMove)
                swap(i,end,array);

        }
        return array;
    }
    private static void swap(int i, int j, List<Integer> array){
        int temp = array.get(j);
        array.set(j,array.get(i));
        array.set(i,temp);

    }


    public static void main(String[] args) {
        System.out.println(moveElementToEnd(Arrays.asList(2, 1, 1, 2, 2, 2, 3, 4, 5),2));
    }
}
