package collect;

import org.apache.commons.collections.list.SynchronizedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadsCollections {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = new ArrayList<>(1000);
        for (int i = 0; i < 1000; i++) {
            list.add(i);
        }

        List<Integer> synchronizedList = Collections.synchronizedList(list);

        List<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>(list);

        cycle(synchronizedList);
        System.out.println("----------------------");
        cycle(copyOnWriteArrayList);

    }

    public static void cycle(List<Integer> list ) throws InterruptedException {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                long first = System.currentTimeMillis();
                for (int i = 0; i < list.size() / 2; i++) {
                    System.out.print(list.get(i) + " ");
                }
                long second = System.currentTimeMillis();
                System.out.println("\n" + (second - first));
            }

        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                long first = System.currentTimeMillis();
                for (int i = list.size() / 2; i < list.size(); i++) {
                    System.out.print(list.get(i) + " ");
                }
                long second = System.currentTimeMillis();
                System.out.println("\n" + (second - first));
            }
        });
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();



    }
}
