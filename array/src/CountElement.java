import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountElement
{
    static int countElements(int[] arr) {

        int count =0 ;
        Set<Integer> set = new HashSet<>();
        for(int a : arr){
            set.add(a);
        }
        for(int e : arr){
           if(set.contains(e+1))
               count++;

        }
        return count;


    }

    public static void main(String[] args) {
        System.out.println(countElements(new int [] {1,3,2,3,5,0}));
        System.out.println(countElements(new int [] {1,1,2}));
    }

}
