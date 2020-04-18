import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class FileLineCounter implements Callable<String> {
    private Path path = Paths.get("src");

    public static void main(String[] args) {
        FileLineCounter demo = new FileLineCounter();
        System.out.printf("Total number of line s: %d%n",demo.computeNumberOfLines() );
    }

    public long computeNumberOfLines() {
        long total = 0;

        try {
            total = executeCounters().stream().mapToLong(this::extractValueFromFuture).sum();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return total;
    }

    public List<Future<Long>> executeCounters() throws IOException, InterruptedException {

        ExecutorService service = Executors.newCachedThreadPool();
        List<Future<Long>> futureList = service.invokeAll(getFileLineCounter());
        service.shutdown();
        return futureList;
    }

    private List<Callable<Long>> getFileLineCounter() throws IOException {

        return Files.list(path).filter(Files::isRegularFile).map(this::callablePrintCounter).collect(Collectors.toList());
    }

    private Callable<Long> callableCounter(Path p) {
        return () -> Files.lines(p).count();
    }


    private Callable<Long> callablePrintCounter(Path p) {
        return () ->{

            long c = Files.lines(p).count();
            System.out.printf("%s hase %d lines %n",p,c);
            return c;
        };
    }
    @Override
    public String call() throws Exception {
        return null;
    }

    private <T> T extractValueFromFuture(Future<Long> future) {
        T val = null;

        try {
            future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();

        }
        return val;
    }
}
