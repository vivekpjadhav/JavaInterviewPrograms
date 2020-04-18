import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class CBDemo {

    public static void main(String[] args) throws InterruptedException, BrokenBarrierException {
        CyclicBarrier b1 = new CyclicBarrier(5);
        CyclicBarrier b2 = new CyclicBarrier(5);


        for (int i = 0; i < 5; i++) {

            new Thread(new CBWorker(i,b1,b2)).start();

        }
        System.out.println("work CB is done started workers ");

        System.out.println("while cB workers are running");

        System.out.println("-----done------");
    }

}
