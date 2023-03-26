package test.eric.thread;

import java.util.concurrent.*;

public class TestCallable {
    public static void main(String[] args) {
        Callable<Integer> callable = new Callable<Integer>() {
            public Integer call() throws Exception {
                return 1;
            }
        };

        FutureTask<Integer> futureTask = new FutureTask<Integer>(callable);

        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(futureTask);
        Future future = executor.submit(futureTask);
        try {
            Object obj = future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
