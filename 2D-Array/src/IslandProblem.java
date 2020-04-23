public class IslandProblem {

    static int[][] matrix =
            {{0, 1, 0, 1, 0},
            {0, 0, 1, 1, 1},
            {1, 0, 0, 1, 0},
            {0, 1, 1, 0, 0},
            {1, 0, 1, 0, 1}};


    static int row , col;

    static int getIslandCount(int [][] binaryMatrix){
        row = binaryMatrix.length;
        col = binaryMatrix[0].length;
        int count=0;


        for (int r=0; r<row ;r++){
            for (int c = 0; c < col ; c++) {
                if(binaryMatrix[r][c]==1 ){

                    count++;
                    DFS(binaryMatrix,r,c);
                }

            }
        }
        return count;

    }


    static void  dfs(int[][]grid,int r,int c ){

        if(r < 0 || c < 0 || r >= grid.length  || c>= grid[r].length   || grid[r][c] =='0') {
            return ;
        }

        grid[r][c]='0';
        dfs(grid,r+1 ,c);
        dfs(grid,r-1 ,c);
        dfs(grid,r ,c+1);
        dfs(grid,r ,c-1);
        return ;


    }

    static int[][] aroundArr = {{-1,0},{0,1},{1,0},{0,-1}};
    static void  DFS(int[][]grid,int r,int c ){

        if(r < 0 || c < 0 || r >= grid.length  || c>= grid[r].length   || grid[r][c] =='0') {
            return ;
        }

        grid[r][c]='0';
        for (int i =0 ; i < aroundArr.length;i++) {
            dfs(grid, r + aroundArr[i][0], c + aroundArr[i][1]);
        }
        return ;


    }



    public static void main(String[] args) {


        System.out.println(getIslandCount(matrix));


    }

}
