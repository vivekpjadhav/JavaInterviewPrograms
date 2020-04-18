import java.util.*;

import static java.lang.Math.log10;
import static java.lang.Math.min;

public class RomanToNumaric {
    static Map<String, Integer> romanMap = new HashMap<>();
//    static   int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
//    static String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
static int hundred;
static String value;

    static {
        romanMap.put("I", 1);
        romanMap.put("V", 5);
        romanMap.put("IX", 9);
        romanMap.put("X", 10);
        romanMap.put("XL", 40);
        romanMap.put("L", 50);
        romanMap.put("XC", 90);
        romanMap.put("C", 100);
        romanMap.put("CD", 400);
        romanMap.put("D", 500);
        romanMap.put("CM", 900);
        romanMap.put("M", 1000);

    }

    static int romanToInt(String s) {
        char[] arr = s.toCharArray();
        int sum = 0;
        int i = 0;
        while (i < arr.length) {
            String ch = String.valueOf(arr[i]);
            int curr = romanMap.get(ch);
            int next = 0;
            if (i + 1 < arr.length) {
                next = romanMap.get(String.valueOf(arr[i + 1]));
            }
            if (curr < next) {
                sum += (next - curr);
                i += 2;
            } else {
                sum += curr;
                i++;
            }


        }
        return sum;

    }

        // maximum int value in roman is 3999
        static String intToRoman(int n) {
            StringBuilder sb = new StringBuilder();
            // Loop through each symbol, stopping if num becomes 0.
            if(n > 3999) return "out of range";
            List<Integer> list = new ArrayList<>();
            while(n!=0 ){
                list.add(n%10);
                n=n/10;
            }
            int size = list.size()-1;

               System.out.println(romanMap.get(3));
               int thousand = list.get(3);
               while (thousand != 0){
                  romanMap.entrySet().stream().filter(x->x.getValue() ==1000)
                           .map(x->x.getKey()).forEach(sb::append);
                   thousand-=1;
               }
               hundred = list.get(2);





            return sb.toString();

    }

    public static void main(String[] args) {
        // System.out.println(romanToInt("III"));
//        System.out.println(romanToInt("X"));
//        System.out.println(romanToInt("LVIII"));
//        System.out.println(romanToInt("MCMXCIV"));
        System.out.println(intToRoman(3994));
        int n = 1994;
        List<Integer> list = new ArrayList<>();

        while(n!=0){
        list.add(n%10);
        n=n/10;
        }
        System.out.println(3/1);
        System.out.println(Arrays.toString(list.toArray()));

    }
}
