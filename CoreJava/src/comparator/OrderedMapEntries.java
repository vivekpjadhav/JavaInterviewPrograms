package comparator;

import java.util.*;

public class OrderedMapEntries {

    public static void main(String[] args) {
        Map<String,Integer> theMap = new HashMap<>();


        theMap.put("sim",10);
        theMap.put("aim",9);
        theMap.put("fim",2);
        theMap.put("Jim",12);
        theMap.put("bim",12);

        Comparator<Map.Entry<String,Integer>> comparator =
                Map.Entry.<String,Integer>comparingByValue()
                .reversed()
                .thenComparing(Map.Entry.comparingByKey());

        List<Map.Entry<String ,Integer>> entryList  = new ArrayList<>(theMap.entrySet());
        entryList.sort(comparator);
        entryList.forEach(e-> System.out.printf("%10s : %4d\n",e.getKey(),e.getValue()));
    }

}
