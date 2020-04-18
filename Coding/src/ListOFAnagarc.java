import java.util.*;
import java.util.stream.Stream;

public class ListOFAnagarc {

    static void anagrams(String[] words) {

        int n = words.length;
        Map<String, List<String>> anagram = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char[] word = words[i].toCharArray();
            Arrays.sort(word);
            String a = new String(word);
            List<String> list  = anagram.getOrDefault( a, new ArrayList<>());
            list.add(words[i]);
            anagram.put( a, list);
        }

        anagram.entrySet().stream()
                .filter(a->a.getValue().size()>1).map(a->a.getValue()).forEach(a->System.out.printf(" %s ",a));


    }

    public static void main(String[] args) {
        anagrams(new String[]{"cat","dog","act","god","SDF","sdf","apple","alppe"});
    }
}
