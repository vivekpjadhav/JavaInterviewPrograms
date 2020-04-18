package com.company.concurancy;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyExcecutor {

    public static void main(String[] args) {
        List<MyRunnable> myRunnables = Stream.iterate(0,n->n+1)
                .map(MyRunnable::new)
                .limit(10)
                .collect(Collectors.toList());

        ExecutorService executorService = Executors.newCachedThreadPool();
        myRunnables.forEach(executorService::execute);
        /*for (MyRunnable runnable :myRunnables){
           executorService.execute(runnable);
        }*/
        executorService.shutdown();
    }
}
