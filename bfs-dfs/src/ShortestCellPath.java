/**
 * In a given grid of 0s and 1s, we have some starting row and column sr, sc and a target row and column tr, tc.
 * Return the length of the shortest path from sr, sc to tr, tc that walks along 1 values only.
 * <p>
 * Each location in the path, including the start and the end, must be a 1.
 * Each subsequent location in the path must be 4-directionally adjacent to the previous location.
 * <p>
 * It is guaranteed that grid[sr][sc] = grid[tr][tc] = 1, and the starting and target positions are different.
 * <p>
 * If the task is impossible, return -1.
 */
public class ShortestCellPath {


    static int shortestCellPath(int[][] grid, int sr, int sc, int tr, int tc) {
        // your code goes here
/*
            1111
            0001
            1111
            0 -- visited
            1 -- not visited
*/
        if (grid == null || grid[0].length == 0) return -1;
        // if(sr == tr && sc == tc) return 0;
        return shortestCellPathHelper(grid, sr, sc, tr, tc);
    }

    public static int shortestCellPathHelper(int[][] grid, int row, int col, int tr, int tc) {
        if (!isValid(grid, row, col)) return 0;
       // if (sr == tr && sc == tc) return 1;
        grid[row][col] = 1;
        int left = shortestCellPathHelper(grid, row, col - 1,tr, tc);
        int up = shortestCellPathHelper(grid, row - 1, col,tr, tc);
        int right = shortestCellPathHelper(grid, row, col + 1,tr, tc);
        int down = shortestCellPathHelper(grid, row + 1, col,tr, tc);
        return Math.min(Math.min(left, up), Math.min(right, down));
    }

    public static boolean isValid(int[][] grid, int row, int col) {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        int[][] grid = new int[][]{{1, 1, 1, 1}, {0, 0, 0, 1}, {1, 1, 1, 1}};
        System.out.println(shortestCellPath(grid, 0, 0, 2, 0));
    }
}
