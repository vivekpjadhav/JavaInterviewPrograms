import java.util.ArrayList;
import java.util.List;

public class BackSpace {

    static boolean backspaceCompare(String S, String T) {
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
        for(int i =0 ; i<S.length();i++){

            if(S.charAt(i) !='#' )
                list1.add(S.charAt(i));
            else if(S.charAt(i) =='#' && !list1.isEmpty()){
                list1.remove(list1.size()-1);
            }
        }

        for(int i =0 ; i<T.length();i++){

            if(T.charAt(i) !='#' )
                list2.add(T.charAt(i));
            else if(T.charAt(i) =='#' && !list2.isEmpty()){
                list2.remove(list2.size()-1);
            }
        }

        if(list1.size() ==list2.size() &&  list1.equals(list2)){

            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(backspaceCompare("a#c","b"));
    }
}
