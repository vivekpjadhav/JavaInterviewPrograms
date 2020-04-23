public class MinPathSum {


    public static void main(String[] args) {
        int[][] grid = {{1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}};
        System.out.println(minPathSum1(grid));
    }

        static int minPathSum1 ( int[][] grid){
            if (grid == null || grid.length == 0)
                return 0;

            int m = grid.length, n = grid[0].length;
            int[][] dp = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    dp[i][j] += grid[i][j];
                    if (i > 0 && j > 0) {
                        dp[i][j] += Math.min(dp[i - 1][j], dp[i][j - 1]);
                    } else if (i > 0) {
                        dp[i][j] += dp[i - 1][j];
                    } else if (j > 0) {
                        dp[i][j] += dp[i][j - 1];
                    }
                }
            }
            return dp[m - 1][n - 1];


        }

        public int minPathSum ( int[][] grid){
            return calculate(grid, 0, 0);

        }

        public int calculate ( int[][] grid, int i, int j){
            if (i == grid.length || j == grid[0].length)
                return Integer.MAX_VALUE;

            if (i == grid.length - 1 && j == grid[0].length - 1)
                return grid[i][j];

            return grid[i][j] + Math.min(calculate(grid, i + 1, j), calculate(grid, i, j + 1));
        }
    }
