public class ClimbingTheStairs {

    public static int climbing(int i , int steps){
        if(steps < i) return 0;
        if(steps ==  i ) return 1;

        return climbing(i+1,steps)+climbing(i+2,steps);

    }

    public static int climbMemo(int i, int steps, int memo[]){
        if(i > steps ) return 0;
        if(i == steps ) return 1;

        if(memo[i] >0){
            return memo[i];
        }
        memo[i] = climbMemo(i + 1,steps,memo)+climbMemo(i + 2,steps,memo);
        return memo[i];
    }
    public static int climbStairs(int n) {
        int memo[] = new int[n + 1];
        return climb_Stairs(0, n, memo);
    }
    public static int climb_Stairs(int i, int n, int memo[]) {
        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }
        if (memo[i] > 0) {
            return memo[i];
        }
        memo[i] = climb_Stairs(i + 1, n, memo) + climb_Stairs(i + 2, n, memo);
        return memo[i];
    }


    static int treeSteps(int i, int steps){
        if(i> steps){
            return 0;
        }
        if(steps == i){
            return 1;
        }

        return treeSteps(i+1,steps)+treeSteps(i+2,steps)+treeSteps(i+3,steps);

    }
    public static void main(String[] args) {
        int n = 4;

        int memo[] = new int[n + 1];
        System.out.println(climbMemo(0,n,memo));
        System.out.println(climbing(0,n));
        System.out.println(treeSteps(0,3));

        System.out.println(climbStairs(n));

    }
}
