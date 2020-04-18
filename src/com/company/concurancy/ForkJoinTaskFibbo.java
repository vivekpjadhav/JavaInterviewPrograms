package com.company.concurancy;

import java.util.concurrent.RecursiveTask;

public class ForkJoinTaskFibbo extends RecursiveTask<Integer> {

    final int n ;

    public ForkJoinTaskFibbo(int n) {
        this.n = n;
    }

    @Override
    protected Integer compute() {
       if(n<=1) return n;

       ForkJoinTaskFibbo f1 = new ForkJoinTaskFibbo(n-1);
       f1.fork();
        ForkJoinTaskFibbo f2 = new ForkJoinTaskFibbo(n-2);
        f2.fork();

        return f2.join()+f1.join();

    }

    public static void main(String[] args) {
        ForkJoinTaskFibbo d = new ForkJoinTaskFibbo(8);
        System.out.println(d.compute());
    }
}
