import java.util.concurrent.CountDownLatch;

public class LatchDemo {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch ss = new CountDownLatch(1);

        CountDownLatch es = new CountDownLatch(5);
        for (int i = 0; i < 5; i++) {

            new Thread(new Worker(i,ss,es)).start();

        }
        System.out.println("work is done started workers ");
        ss.countDown();// g0--
        System.out.println("while workers are running");
        es.await();
        System.out.println("-----done------");
    }

}
