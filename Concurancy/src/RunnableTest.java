import java.util.concurrent.*;

import static java.util.concurrent.TimeUnit.SECONDS;

public class RunnableTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Task1());
        t1.start();
        ExecutorService service = Executors.newFixedThreadPool(2);
        // SynchronousQueue
        ExecutorService serviceNew = Executors.newCachedThreadPool();
        //delay queue
        ScheduledExecutorService serviceSch = Executors.newScheduledThreadPool(12);
        serviceSch.scheduleAtFixedRate(new Task1(),10,100,SECONDS);
        ExecutorService serviceSingle = Executors.newSingleThreadExecutor();

        for (int i = 0; i <100 ; i++) {

            service.execute(new Task1());
        }
        service.shutdown();
/**
 * Create new  thread pool executor
 *  ExecutorService service = new ThreadPoolExecutor(10,10,120, SECONDS,new LinkedBlockingQueue<>());
 *         service.execute(new Task1());
 *         service.isTerminated()
 *         service.isShutdown();
 */


    }

}

class Task1 implements Runnable{
    @Override
    public void run() {
        System.out.printf("current thread %s %n", Thread.currentThread().getName());
    }
}