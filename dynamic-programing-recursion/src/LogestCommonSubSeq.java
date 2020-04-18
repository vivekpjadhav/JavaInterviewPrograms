public class LogestCommonSubSeq {


    public static int subSeq(char[] str1, char[] str2) {
      int[][] T = new int[str1.length+1][str2.length+1];
      if(str1.length ==0 && str2.length ==0) return 0;

      int max =0 ;
        for (int i = 1; i < T.length ; i++) {
            for (int j = 1; j < T[0].length  ; j++) {
                if(str1[i-1] == str2[j-1])
                    T[i][j]= T[i-1][j-1]+1;
                else
                    T[i][j] = Math.max(T[i][j-1],T[i-1][j]);

                max= Math.max(T[i][j],max);

            }
        }
        return max;
    }


    public static int lcs(char[] s1, char[] s2, int l1, int l2) {
        if(s1.length == l1 || s2.length == l2) return 0;

        if(s1[l1]==s2[l2]){
            return 1+ lcs(s1,s2,l1+1,l2+1);
        }else{
            return Math.max(lcs(s1,s2,l1+1,l2),lcs(s1,s2,l1,l2+1));
        }
    }

    public static void main(String[] args) {

        String s1 = "abcdaf";
        String s2 = "acbcf";
        System.out.println(subSeq(s1.toCharArray(), s2.toCharArray()));
        System.out.println(lcs(s1.toCharArray(), s2.toCharArray(), 0,0));


    }
}
