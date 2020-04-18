import javax.swing.plaf.FontUIResource;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CallableWithExecutors {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(10);
        List<Future> list = new ArrayList<>();
        for (int i = 0; i <100 ; i++) {
          Future<Integer> f =  service.submit(new TaskCall());
            list.add(f);
        }
        for (int i = 0; i <list.size() ; i++) {
            Future<Integer> future = list.get(i);

            System.out.println(future.get());

        }

       // System.out.println(future.get());

    }
}

class TaskCall implements Callable<Integer>{
    int a=1 ;
    @Override
    public Integer call() throws Exception {


        this.jobFour();
        this.jobThree();
        return a;
    }

    public void jobThree(){
        System.out.println("job 3 ");
    }
    public void jobFour(){
        System.out.println("job 4 ");
    }
}
