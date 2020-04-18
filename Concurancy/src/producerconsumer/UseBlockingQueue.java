package producerconsumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class UseBlockingQueue {

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Item> queue = new LinkedBlockingQueue<>();

        final Runnable producer = () -> {
            while (true) {
                try {
                    queue.put(createItem());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        new Thread(producer).start();
        new Thread(producer).start();

        final Runnable consumer = () -> {
            while (true) {
                try {
                    Item i = queue.take();
                    process(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };
        new Thread(consumer).start();
        new Thread(consumer).start();

        Thread.sleep(5000);

    }
    static int i;
    static int j;
    static Item createItem() {
        return new Item(i++, j++);

    }

    static void process(Item i) {
        System.out.println(i.toString());

    }
}

class Item {
    int a, b;

    public Item(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Item{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
