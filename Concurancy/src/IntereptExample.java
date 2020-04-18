import java.util.concurrent.atomic.AtomicBoolean;

public class IntereptExample {
     AtomicBoolean atomicBoolean = new AtomicBoolean(true );
    public static void main(String[] args) throws InterruptedException {

        TaskInterept task = new TaskInterept();
        Thread t1 = new Thread(task);
        t1.start();

        Thread.sleep(1000);
        task.check =false;

    }
    void stop(){
        atomicBoolean.set(false);
    }

}

class TaskInterept implements Runnable{
    public  volatile boolean check = true;
    @Override
    public void run() {
        while(check){
            System.out.println("running thread : "+ Thread.currentThread().getName());
        }

    }
}