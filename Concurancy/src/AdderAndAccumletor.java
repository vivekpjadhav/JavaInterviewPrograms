import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.concurrent.atomic.LongAdder;

public class AdderAndAccumletor {
    public static void main(String[] args) throws InterruptedException {


          LongAdder counter = new LongAdder();
      //  LongAccumulator longAccumulator = new LongAccumulator((x,y)->x+y,0);

        ExecutorService service = Executors.newFixedThreadPool(16);
        for (int i = 0; i <100 ; i++) {
            service.submit(new Task(counter));
        }

        Thread.sleep(2000);
        System.out.println(counter.sum());
    }

    private static class Task implements  Runnable {
        private  final LongAdder counter;

        public Task(LongAdder counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
             counter.increment();

        }
    }

}


