import java.util.Arrays;

public class ShiftingTheArray {

    public static void main(String[] args) {
       // rightShiftByOne(new int[]{1,2,3,4});
        String s =stringShift("abc",new int[][]{{0,1},{1,2}});
        System.out.println(s);


    }

    static String stringShift(String s, int[][] shift) {
        char[] words = s.toCharArray();

        for (int i = 0; i < shift.length; i++) {
                if (shift[i][0] == 0) {
                    int times = shift[i][1];
                    while (times != 0) {
                        leftShiftByOne(words);
                        times--;
                    }
                } else if (shift[i][0] == 1) {
                    int times = shift[i][1];
                    while (times != 0) {
                        rightShiftByOne(words);
                        times--;
                    }
                }

        }
       return String.valueOf(words);
    }

    private static void rightShiftByOne(char [] arr){
        int n = arr.length-1;
        char temp = arr[n];
        for(int i = n-1 ; i >=0 ; i--){
            arr[i+1] = arr[i];
        }
        arr[0] =temp;

        System.out.println(Arrays.toString(arr));

    }
    static void leftShiftByOne(char [] arr){
        int n = arr.length-1;
        char temp = arr[0];
        for(int i = 0 ; i < n ; i++){
            arr[i] = arr[i+1];
        }
        arr[n] =temp;

        System.out.println(Arrays.toString(arr));

    }

}


