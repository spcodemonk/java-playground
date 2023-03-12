package org.example.thread.executor.service;

import org.apache.commons.lang3.time.StopWatch;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class MyExecutorService {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService exService = Executors.newFixedThreadPool(1);
        System.out.println(Thread.currentThread().getName());
        StopWatch watch = new StopWatch();
        watch.start();
        List<Future<Integer>> futureList = new ArrayList<>();
        for (int i=10;i<=50;i+=10){
            Future<Integer> value = exService.submit(new CTR(i));
            futureList.add(value);
        }

        futureList.stream().forEach(future-> {
            try {
                System.out.println("Element in future --> "+future.get());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        });

        exService.shutdown();
        watch.stop();
        System.out.println("Main method finished  "+ watch.getNanoTime());
    }
}
class CTR implements Callable<Integer>{

    private int number;

    public CTR(int number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName());

        return number * 2;
    }
}
