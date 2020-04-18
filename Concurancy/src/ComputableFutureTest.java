import java.util.Random;
import java.util.concurrent.*;

public class ComputableFutureTest<T>  {


    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);


    }


  public void jobThree(){
      System.out.println("job 3 ");
  }
  public void jobFour(){
      System.out.println("job 4 ");
  }
}

class Task implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return null;
    }
}
