import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CallableDemo {


    public static void main(String[] args) {
        List<MyCallable> myCallables = Stream.iterate(0,n->n+1)
                .map(MyCallable::new).limit(10).collect(Collectors.toList());

        ExecutorService service = Executors.newFixedThreadPool(5);

        try {
            List<Future<String>> futures = service.invokeAll(myCallables);
            for(Future<String> f:futures)
                System.out.println(f.get());

        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }finally {
            service.shutdown();
        }
    }
}
