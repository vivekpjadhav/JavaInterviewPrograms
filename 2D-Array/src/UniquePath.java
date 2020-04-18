public class UniquePath {

    static  int uniquePaths(int m, int n) {

        int[][] dp = new int[m][n];

        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i] = 1;
        }

        for (int row = 1; row < dp.length; row++) {
            for (int col = 1; col < dp[row].length; col++) {
                dp[row][col] = dp[row-1][col] + dp[row][col-1];
            }

        }
        return dp[m-1][n-1];


    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(3,3));
    }
}
