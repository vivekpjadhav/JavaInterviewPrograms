import java.util.*;
import java.util.stream.Stream;

public class FrequancySort {

    static String frequencySort(String s) {

        Map<Character, Integer> countMap = new HashMap<>();
        List<Character> outputArray = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            int count = countMap.getOrDefault(s.charAt(i), 0);
            countMap.put(s.charAt(i), ++count);
            outputArray.add(s.charAt(i));

        }

        Comparator<Map.Entry<Character, Integer>> comparator = Map.Entry.<Character, Integer>comparingByValue().reversed();

        ArrayList<Map.Entry<Character, Integer>> entries = new ArrayList<>(countMap.entrySet());
        entries.sort(Map.Entry.<Character, Integer>comparingByValue().reversed());

        countMap.entrySet().stream().forEach(System.out::print);

        return s;
    }


    public static void main(String[] args) {
        frequencySort("tree");
    }
}
