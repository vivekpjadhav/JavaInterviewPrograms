import java.util.Arrays;

public class DecodeVariations {


//    function decodeVariations(S):
//    N = S.length
//            dp = new Array(N)
//    dp[N] = 1
//            for i from N-1 to 0:
//            if S[i] == '0':
//    dp[i] = 0
//            else if S[i] == '1':
//    dp[i] = dp[i+1] + dp[i+2]
//            else if S[i] == '2':
//    dp[i] = dp[i+1]
//            if i+1 < S.length && S[i+1] <= '6':
//    dp[i] += dp[i+2]
//            else:
//    dp[i] = dp[i+1]
//
//            return dp[0]


    static double findGrantsCap(int[] grantsArray, int newBudget) {
        // your code goes here
        int n = grantsArray.length;
        double avg = newBudget / grantsArray.length;
        double[] result = new double[grantsArray.length];
        int leftOver=0;
        Arrays.sort(grantsArray) ;

        for(int i =0 ,j=1; i<= n-1 ;i++){
            if(grantsArray[i] <= avg){
                result[i] = grantsArray[i];
                avg = (avg) + ( avg - result[i])/ (n-j++);

            }else{
                result[i] = avg;
            }
        }
        System.out.println(Arrays.toString(result));
        return avg;

    }


    public static void main(String[] args) {
     findGrantsCap(new int[]{2, 100, 50, 120, 1000}, 190);

    }

}
