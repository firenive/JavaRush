package collect;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnQueue {


    public static void main(String[] args) {
//        Queue<Integer> queue = new LinkedList<>();
//        for (int i = 5; i >=1; i--) {
//            queue.add(i);
//        }
//
//        while (!queue.isEmpty()) System.out.println(queue.poll());
//
//        System.out.println("--------------");

        Queue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 % 2 == 0) {
                    if (o2 % 2 == 0) {
                        return o1.compareTo(o2);
                    } else {
                        return -1; // четные всегда меньше нечетных
                    }
                } else {
                    if (o2 % 2 == 0) {
                        return 1; // нечетные всегда больше четных
                    } else {
                        return o1.compareTo(o2);
                    }
                }
            }
        });
        priorityQueue.add(5);
        priorityQueue.add(2);
        priorityQueue.add(1);
        priorityQueue.add(4);

        while (!priorityQueue.isEmpty()) System.out.println(priorityQueue.poll());


    }
}
