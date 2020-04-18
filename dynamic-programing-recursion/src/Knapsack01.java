public class Knapsack01 {

    public static void main(String[] args) {
        Knapsack01 k = new Knapsack01();
        int val[] = {22, 20, 15, 30, 24, 54, 21, 32, 18, 25};
        int wt[] = {4, 2, 3, 5, 5, 6, 9, 7, 8, 10};
        int r = k.bottomUpDP(val, wt, 30);
        //int r1 = k.topDownRecursive(val, wt, 30);
        System.out.println(r);
        //System.out.println(r1)
    }

    public int bottomUpDP(int val[], int wt[], int W){
        int result[][] = new int[val.length+1][W+1];
        for(int i=0; i <= val.length; i++){
            for(int j=0; j <= W; j++){
                if(i == 0 || j == 0){
                    result[i][j] = 0;
                    continue;
                }
                if(j - wt[i-1] >= 0){
                    result[i][j] = Math.max(result[i-1][j], result[i-1][j-wt[i-1]] + val[i-1]);
                }else{
                    result[i][j] = result[i-1][j];
                }
            }
        }
        return result[val.length][W];
    }

}
