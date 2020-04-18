package producerconsumer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class BlockingQ<T> {
    ReentrantLock lock = new ReentrantLock(true);
    Condition notFull = lock.newCondition();
    Condition notEmpty = lock.newCondition();
    private Queue<T> queue;
    private int SIZE = 16;

    public BlockingQ(int SIZE) {
        queue = new LinkedList<>();
        this.SIZE = SIZE;
    }


    public void put(T t) throws InterruptedException {
        lock.lock();
        try {
            while (queue.size() == SIZE) {
                notFull.await();
            }
            queue.add(t);
            notEmpty.signalAll();
        } finally {
            lock.unlock();
        }

    }

    public T take() throws InterruptedException {
        lock.unlock();
        try {
            while (queue.size() == 0) {
                notEmpty.await();
            }

            T item = queue.remove();
            notFull.signalAll();
            return item;
        } finally {
            lock.unlock();
        }

    }
}
