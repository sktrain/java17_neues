package sk.train.vthreads;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

public class VThreadDemo {

    public static void main(String[] args) {
        var a = new AtomicInteger(0);
        //jeweils eine Variante mit Platform-Threads und Virtuellen Threads
//        try (var vs = Executors.newFixedThreadPool(200)) {
        try (var vs = Executors.newVirtualThreadPerTaskExecutor()) {
            List<Future<Integer>> futures = new ArrayList<>();
            var begin = System.currentTimeMillis();
            //Simulation: Blockierend/Wartend
            for (int i=0; i<1_000; i++) {
                var future = vs.submit(() -> {
                    Thread.sleep(Duration.ofSeconds(1));
                    return a.addAndGet(1);
                });
                futures.add(future);
            }
            // Auf die Ergebnisse warten
            for (var future : futures) {
                var i = future.get();
                if (i % 10000 == 0) {
                    System.out.println(i + " ");
                }
            }
            // Zeit messen
            System.out.println("Exec finished.");
            System.out.printf("Exec time: %dms.%n", System.currentTimeMillis() - begin);
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
