package com.company.concurancy.locks;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class LocksDemo {
    private Counter counter = new Counter();
    private SyncCounter syncCounter = new SyncCounter();
    private LockedCounter lockedCounter = new LockedCounter();
    public void demoCounter(){
        ExecutorService executorService = Executors.newCachedThreadPool();
        IntStream.range(0,1000).forEach(i -> executorService.submit(counter::increment));
        executorService.shutdown();

        System.out.println("counter count "+counter.getCount());
    }

    public void demoSyncCounter(){
        ExecutorService executorService = Executors.newCachedThreadPool();
        IntStream.range(0,1000).forEach(i -> executorService.submit(syncCounter::increment));
        executorService.shutdown();

        System.out.println("counter count "+syncCounter.getCount());
    }
    public void demoLockCounter(){
        ExecutorService executorService = Executors.newCachedThreadPool();
        IntStream.range(0,1000).forEach(i -> executorService.submit(lockedCounter::increment));
        executorService.shutdown();

        System.out.println("counter count "+lockedCounter.getCount());
    }


    public static void main(String[] args) {
        LocksDemo demo = new LocksDemo();
        demo.demoCounter();
        demo.demoSyncCounter();
        demo.demoLockCounter();
    }
}
