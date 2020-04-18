public class PathSum {


    public static void main(String[] args) {
        int[][] arr ={{1, 3, 1},
                      {1, 5, 1},
                     {4, 2, 1}};
        System.out.println(minPathSum(arr));
    }

    public static int minPathSum(int[][] grid) {
        return calculate(grid, 0, 0);

    }

    public static int calculate(int[][] grid, int i, int j) {

        if (i == grid.length || j == grid[0].length)
            return Integer.MAX_VALUE;

        if (i == grid.length - 1 && j == grid[0].length - 1)
            return grid[i][j];



        return grid[i][j] + Math.min(calculate(grid, i + 1, j), calculate(grid, i, j + 1));
    }
}
