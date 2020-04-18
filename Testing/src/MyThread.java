public class MyThread extends Thread {
    private int id ;

    public MyThread(int id){
        this.id = id;
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
