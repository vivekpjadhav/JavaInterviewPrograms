public class CodeDycript {


    static String decrypt(String word) {
        // your code goes here
        char[] words = word.toCharArray();
        char[] result = new char[words.length];
        int step2 = 1;
        int ascii = 0;
        for (int i = 0; i < words.length; i++) {
            ascii = words[i];
            ascii = ascii - step2;
            while (ascii < 'a') {
                ascii += 26;
            }
            result[i] = (char) ascii;
            step2 = step2 + ascii;
        }
        return String.valueOf(result);
    }


    public static void main(String[] args) {
        System.out.println(decrypt("flgxswdliefy"));
    }
}
