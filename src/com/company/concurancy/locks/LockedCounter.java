package com.company.concurancy.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockedCounter {

    private int i;
    private Lock lock = new ReentrantLock();

    public void increment() {
        lock.lock();
        try {
            i++;
        }finally {
            lock.unlock();
        }
    }
    public int getCount(){
        lock.lock();
        try{
            return i;
        }finally {
            lock.unlock();
        }
    }
}
