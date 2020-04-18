package pc;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
     private  int id;
     private BlockingQueue<Message> queue;

    public Producer(int id, BlockingQueue<Message> queue) {
        this.id = id;
        this.queue = queue;
    }




    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            Message msg = new Message(i);

            try {
                queue.put(msg);
                    System.out.printf(" producer %d produced %d %n ",id,msg.getId());
                    Thread.sleep((long) (Math.random()*100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        try {
            queue.put(new Message(-1));
            Thread.sleep((long) (Math.random()*100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
