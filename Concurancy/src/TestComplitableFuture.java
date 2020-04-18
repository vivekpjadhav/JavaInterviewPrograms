import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Stack;
import java.util.concurrent.*;

public class TestComplitableFuture {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Stack<String> d = new Stack<>();
        ExecutorService service = Executors.newFixedThreadPool(10);
        Future<Integer> future = null;
        List<Future> fList = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {

            fList.add(service.submit(new Task()));
        }


        try {
            Integer ans = future.get(); //blocking call
         //   Integer ans1 = future1.get(); //blocking call
           // Integer ans2 = future2.get(); //blocking call
            CompletableFuture<String> completableFuture
                    = CompletableFuture.supplyAsync(() -> "Hello")
                    .thenCompose(s -> CompletableFuture.supplyAsync(() -> s +"world"));
               System.out.println("result form the last "+ ans);
              //  System.out.println("result form the last "+ ans1);
                System.out.println("result form the last "+ completableFuture.get());
                service.shutdown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }

    }


    static class Task implements Callable<Integer>{
        @Override
        public Integer call() throws Exception {
            return new Random().nextInt();
        }
    }
}
