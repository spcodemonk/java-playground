package org.example.thread.executor.service;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class MyExecutorService {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService exService = Executors.newFixedThreadPool(2);
        System.out.println(Thread.currentThread().getName());

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
        System.out.println("Main method finished");
    }
}
class CTR implements Callable<Integer>{

    private int number;

    public CTR(int number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        return number * 2;
    }
}
