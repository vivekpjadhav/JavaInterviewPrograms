public class RevStrRec {

    public static void main(String[] args) {

        System.out.println(revString("vivek"));
    }

    static String revString(String str) {
        char[] s = str.toCharArray();
        int n = s.length - 1;
        helper(s, 0, n);

        return String.valueOf(s);


    }

    static void helper(char[] str, int start, int end) {
        if (start >= end) return;

        char tmp = str[end];
        str[end] = str[start];
        str[start] = tmp;

        helper(str, start + 1, end - 1);
    }

}
