import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class AnagramWords {

    static Map<String,List<String>> map1 = new HashMap<>();

    public static List<String> anagrams(List<String> words){
        Iterator it = words.iterator();
        while(it.hasNext()) {
            String x= (String) it.next();
            char[] charW = x.toCharArray();
            Arrays.sort(charW);
            String K = String.valueOf(charW);
            List<String> list = map1.getOrDefault(K, new ArrayList<>());
            list.add(x);
            map1.put(K, list);
        }
        return   map1.entrySet().stream().filter(n->n.getValue().size()>1).map(n->n.getValue().get(0)).collect(Collectors.toList());
    }



    public static List<String> anagramsX(List<String> words){
        Iterator it = words.iterator();
        words.stream().filter(n->  {
            String x= (String) it.next();
            char[] charW = x.toCharArray();
            Arrays.sort(charW);
            List<String> list = map1.getOrDefault(String.valueOf(charW), new ArrayList<>());
            list.add(x);
            map1.put(String.valueOf(charW), list);
            return true;
        }).collect(Collectors.toList());
        return   map1.entrySet().stream().filter(n->n.getValue().size()>1).map(n->n.getValue().get(0)).collect(Collectors.toList());
    }


    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            List<String> list = map.getOrDefault(String.valueOf(ch), new ArrayList<>());
            list.add(strs[i]);
            map.put(String.valueOf(ch), list);

        }
        return new ArrayList<>(map.values());

    }

    public static void main(String[] args) {
        System.out.println(anagramsX(Arrays.asList("cat", "dog", "tac", "god", "act","vivek")));
    }
}
