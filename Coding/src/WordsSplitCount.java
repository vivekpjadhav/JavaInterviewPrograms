import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

class WordsSplitCount {
    static String []newWords;
    static Map<String ,List<String>> wordMap = new HashMap<>();
    static String[][] result;
    static String[][] wordCountEngine(String document) {
        // your code goes here

        String[] words = document.trim().split("[.,!?:;\"-]|\\s+");


        for (String w:words){

         }





        Iterator entires =  wordMap.entrySet().iterator();
       int i=0;
      while( entires.hasNext()){

            Map.Entry  entry = (Map.Entry)entires.next();

            result[i][0] = (String) entry.getKey();
            result[i][1] = String.valueOf(entry.getValue());
            i++;

      }





        return result;


    }

    public static void main(String[] args) {
        String document = "Practice makes perfect. you'll only get Perfect by practice. just practice!";

        System.out.println(wordCountEngine(document));

    }

}