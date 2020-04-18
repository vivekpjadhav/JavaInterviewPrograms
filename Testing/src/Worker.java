import java.util.concurrent.CountDownLatch;

public class Worker implements Runnable {
    private int id ;
    CountDownLatch start;
    CountDownLatch end;

    public Worker(int id, CountDownLatch start, CountDownLatch end) {
        this.id = id;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        try {
            System.out.println("waiting to start "+id);
            start.await();//go ------
            System.out.println("running complition "+id);
            end.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
