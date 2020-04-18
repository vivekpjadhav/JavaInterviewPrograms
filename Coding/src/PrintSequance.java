import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class PrintSequance {


    static int count =1  ;
    static Map<Integer,String> map = new HashMap<>();
    static void printSeq(int seq, String data) {

        map.put(seq,data);

        while(true){

            if(count == seq || map.containsKey(count) ){
                System.out.println(map.get(count));
                count++;
            }else break;

        }




    }

    public static void main(String[] args) {


        printSeq(9,"nine");
        printSeq(2,"two");
        printSeq(3,"three");
        printSeq(4,"four");
        printSeq(8,"eight");
        printSeq(6,"six");
        printSeq(7,"seven");
        printSeq(1,"one");
        printSeq(5,"five");


    }


}
