import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UseMyThread {


    public static void main(String[] args) {

//        List<MyThread> myThreadList = Stream.iterate(10,n->n-1)
//                .map(MyThread::new).limit(10).collect(Collectors.toList());

        List<MyRunnable> myRunnables = Stream.iterate(10,n->n-1)
               .map(MyRunnable::new).limit(10).collect(Collectors.toList());


        myRunnables.forEach(MyRunnable::start);



    }



}
