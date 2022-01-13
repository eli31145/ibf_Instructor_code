package myapp6;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Class7 
{

    public Future<Integer> cube(Integer i) {
        ExecutorService tp = Executors.newFixedThreadPool(2);
        return tp.submit(() -> { 
            return Integer.valueOf(i*i*i); }
        );
    }

    public static void main(String[] args) throws Exception {
        /* ExecutorService threadPool = Executors.newFixedThreadPool(2);
        Runnable r = () -> { 
            System.out.println("Hello, World"); 
    
        };
        threadPool.submit(r); */

        System.out.println("Answer: " + new Class7().cube(3).get());
    }
}
