import java.util.concurrent.RecursiveTask;

public class ForkJoinPoolFibbo extends RecursiveTask<Integer> {

    final  int n;
    ForkJoinPoolFibbo(int n){
        this.n =n;
    }

    @Override
    protected Integer compute() {
        if(n==1) return 1;
        if(n==0) return 1;

        ForkJoinPoolFibbo f1 = new ForkJoinPoolFibbo(n-1);
        f1.fork();
        ForkJoinPoolFibbo f2 = new ForkJoinPoolFibbo(n-2);
        f2.fork();

        return f2.join() + f1.join() ;

    }

    public static void main(String[] args) {
        ForkJoinPoolFibbo myRecursiveAction = new ForkJoinPoolFibbo(6);

        System.out.println( myRecursiveAction.invoke());
    }
}
