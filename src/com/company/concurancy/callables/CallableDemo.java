package com.company.concurancy.callables;

import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CallableDemo {
    public static void main(String[] args) {


        List<Callable<String>> callables = Stream.iterate(0, n -> n + 1)
                .map(MyCallable::new)
                .limit(10)
                .collect(Collectors.toList());

        ExecutorService service = Executors.newFixedThreadPool(10);

        List<Future<String>> futures;
        try {
          futures  = service.invokeAll(callables);
          for (Future<String> future : futures){
              System.out.println(future.get());
          }

        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }finally {
            service.shutdown();
        }


    }
}
