public class FiboMemo {

    static int fibo(int n){
        int memo [] = new int [10000] ;
        if(n==0)return 0;
        if(n==1)return 1;


        if(memo[n] ==0) {

            memo[n] = fibo(n - 1) + fibo(n - 2);
            System.out.println(memo[n]);
        }

        return  memo[n];
    }


    public static void main(String[] args) {
        System.out.println("--------------------");
        System.out.println(fibo(6));
    }

}
