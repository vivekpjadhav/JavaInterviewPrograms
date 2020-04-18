public class MyRunnable implements Runnable {
    private int id ;
    Thread thread = new Thread(this);

    public MyRunnable(int id){
        this.id = id;
    }

    public void start(){
        thread.start();
    }


    @Override
    public void run() {
        System.out.println("the thread id "+this);
    }

    @Override
    public String toString() {
        return "MyThread{" +
                "id=" + id +
                '}';
    }
}
