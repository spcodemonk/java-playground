package org.example.thread.executor.service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyExecutorService {

    public static void main(String[] args) {
        ExecutorService exService = Executors.newFixedThreadPool(2);
        System.out.println(Thread.currentThread().getName());

        Runnable sp = ()->{
            for(int i=0;i<3;i++){
                System.out.println( i+ " " +Thread.currentThread().getName());

            }
        };
        exService.submit(sp);
        exService.submit(sp);

        System.out.println("Available Processors ---> "+Runtime.getRuntime().availableProcessors());
        exService.shutdown();
        System.out.println("Main method finished");
    }
}
