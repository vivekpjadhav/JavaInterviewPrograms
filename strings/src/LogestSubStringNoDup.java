import java.util.HashSet;
import java.util.Set;

public class LogestSubStringNoDup {

    public static void main(String args[]) {
        System.out.println(lengthOfLongestSubstring("ABDEFGABEF"));
        System.out.println(lengthOfLongestSubstring("bbbsafbb"));
    }

    private static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int max = 0;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {

            if (!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
                if (set.size() > max)
                    max = set.size();
            } else {

                    while (s.charAt(start) != s.charAt(i)) {
                        set.remove(s.charAt(start));
                        start++;
                    }
                    start++;

            }

        }
        return max;


    }
}
