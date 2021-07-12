package level18;

import java.util.Comparator;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Test {


    public static void main(String[] args) {
       Clock clock = new Clock();
       Thread clockThread = new Thread(clock);
       clockThread.start();

        try {
            Thread.sleep(4000);
            clockThread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    static class Clock implements Runnable {

        @Override
        public void run() {
            Thread current = Thread.currentThread();

            while (!current.isInterrupted()) {
                try {
                    Thread.sleep(1000);
                    System.out.println("Tik");
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                    // break;
                }
            }
        }
    }
}
