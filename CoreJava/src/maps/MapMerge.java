package maps;

import java.util.*;

public class MapMerge {

    public static void main(String[] args) {
        Map<String,Integer> shop1 = new HashMap<>();
        shop1.put("vj1",2);
        shop1.put("vj2",1);
        shop1.put("vj3",3);
        Map<String,Integer> shop2 = new HashMap<>();
        shop2.put("za2",5);
        shop2.put("za2",4);
        shop2.put("za3",3);
        Map<String,Integer> shop3 = new HashMap<>();
        shop3.put("vj3",12);
        shop3.put("xj2",23);
        shop3.put("xj3",13);

        Map<String,Integer> mergeMap = new HashMap<>();

        List<Map<String,Integer>> stores = new ArrayList<>(
                Arrays.asList(shop1,shop2,shop3)
        );

        for (Map<String,Integer> m :stores){
            m.forEach((k,v) -> mergeMap.merge(k,v,(v1,v2)->v1+v2));
        }

        mergeMap.forEach((k,v)-> System.out.printf("%s spent %d\n",k,v));
        System.out.println("------------------------------");
        mergeMap.replaceAll((k,v)->v+1);
        mergeMap.forEach((k,v)-> System.out.printf("%s spent %d\n",k,v));
    }
}
