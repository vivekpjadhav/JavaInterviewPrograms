package com.company.algo;

public class IslandDFS {
    static int[][] matrix = {{0, 1, 0, 1, 0},
            {0, 0, 1, 1, 1},
            {1, 0, 0, 1, 0},
            {0, 1, 1, 0, 0},
            {1, 0, 1, 0, 1}};
    static int row = matrix.length;
    static int col = matrix[0].length;
    static int[][] aroundArray = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    static int islandCount(int[][] matrix) {
        int count =0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; i < col; j++) {
                if(matrix[i][j] ==1){
                   count += dfs(matrix,i,j);
                }
            }
        }
        return count;
    }

    private static int dfs(int[][] matrix, int i, int j) {
        if(i >=0 && i < row && j>=0 &&j<col ){
            for (int k = 0; k <aroundArray.length ; k++) {
//                for (int l = 0; l <aroundArray[0].length ; l++) {
//
//                    return dfs(matrix,i+k,j+l);
//
//                }
            };
        }
            return 0;

    }

    public static void main(String[] args) {

        System.out.println(islandCount(matrix));


    }
}
