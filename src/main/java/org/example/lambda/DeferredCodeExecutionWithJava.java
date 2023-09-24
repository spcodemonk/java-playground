package org.example.lambda;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

public class DeferredCodeExecutionWithJava {


    public static AtomicInteger counter = new AtomicInteger(0);

    static ExecutorService executorService = Executors.newFixedThreadPool(5);

    public static void main(String[] args) {
        DeferredCodeExecutionWithJava deferredCodeExecutionWithJava = new DeferredCodeExecutionWithJava();

        for (int a = 100; a < 110; a++) {
            int finalA = a;
            deferredCodeExecutionWithJava.generateReportAndSendEmail(() -> deferredCodeExecutionWithJava.getSum(finalA));
            counter.incrementAndGet();
        }

        // Shutdown the executor service and wait for tasks to complete
        executorService.shutdown();
    }

    public void generateReportAndSendEmail(Supplier<Integer> sumSupplier) {
        executorService.submit(() -> {
            int sumToPutInEmail = sumSupplier.get();
            // Generate Report and send an email
            System.out.println("Email sent with sum: " + sumToPutInEmail);
        });
    }

    public int getSum(int a) {
        return a + counter.get();
    }

}

