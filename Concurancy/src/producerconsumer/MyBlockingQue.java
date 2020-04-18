package producerconsumer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyBlockingQue<T> {
    private Queue<T> queue;
    private int SIZE = 16;
    private ReentrantLock lock = new ReentrantLock(true);
    private Condition notFull = lock.newCondition();
    private Condition notEmpty = lock.newCondition();

    public MyBlockingQue(int SIZE) {
        queue = new LinkedList<>();
        this.SIZE = SIZE;
    }
    public synchronized T takeS() throws InterruptedException {

            while(queue.size() ==0  ){
                notEmpty.wait();
            }
            T item = queue.remove();
            notFull.notifyAll();
            return item;
    }
    public T take() throws InterruptedException {
        lock.lock();
        try {
            while(queue.size() ==0  ){
                notEmpty.await();
            }
            T item = queue.remove();
            notFull.signalAll();
            return item;
        }finally {
            lock.unlock();
        }
    }

    public void put(T t) throws InterruptedException {
        lock.lock();
        try {
            while(queue.size() == SIZE ){
                notFull.await();
            }
            queue.add(t);
            notEmpty.signalAll();
        }finally {
            lock.unlock();
        }
    }

}
