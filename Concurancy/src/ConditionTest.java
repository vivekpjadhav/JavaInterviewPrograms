/*
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;


public class ConditionTest {


    public static void main(String[] args) {

    }

    ReentrantLock lock = new ReentrantLock();
    Condition added = lock.newCondition();
    Condition removed = lock.newCondition();


    public void producer(){
        lock.lock();
    try{
        while(count ==MAX_COUNT){
            removed.await();
            add();
            added.signal();
        }

    }finally {
        lock.unlock();
    }

    }

    public void consumer(){
        lock.lock();
        try{
            while(count ==0){
                added.await();
                removed();
                removed.signal();
            }

        }finally {
            lock.unlock();
        }
    }
}
*/
