package pc;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class PCDemo {

    public static void main(String[] args) {
        BlockingQueue<Message> blockingQueue = new LinkedBlockingQueue<>();

        Producer p = new Producer(1,blockingQueue);
        Producer p1 = new Producer(2,blockingQueue);
        Consumer c = new Consumer(1,blockingQueue);
        Consumer c1 = new Consumer(2,blockingQueue);

        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        service.execute(p);
        service.execute(p1);
        service.execute(c);
        service.execute(c1);

        service.shutdown();
    }


}
