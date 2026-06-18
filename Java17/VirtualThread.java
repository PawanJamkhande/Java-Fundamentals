package Java17;
/*
Virtual thread is a lightweight thread managed by JVM instead of operating system
it allows java applications to create thousands of concurrent thread efficiently 
*/

import java.util.ArrayList;
import java.util.List;

public class VirtualThread {

    public static Thread completeorder(int custId) {
        return Thread.startVirtualThread(() -> {
            System.out.println("Preparing food: " + custId);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Order Delivered: " + custId);
        });
    }

    public static void main(String[] args) throws InterruptedException {
        List<Thread> threads = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            threads.add(completeorder(i));
        }

        // Wait for all threads to complete
        for (Thread t : threads) {
            t.join();
        }

        System.out.println("All orders completed!");
    }
}
