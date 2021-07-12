package collect;

import java.util.*;

public class LearnHashMap {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<>();
        m.put(5, "a");
        m.put(4, "b");
        m.put(3, "c");
        m.put(2, "d");
        m.put(1, "e");
        System.out.println(m);

        Map<Integer, String> linkM = new LinkedHashMap<>(5, 1, true);
        linkM.put(5, "a");
        linkM.put(4, "b");
        linkM.put(3, "c");
        linkM.put(2, "d");
        linkM.put(1, "e");
        linkM.get(3);
        linkM.get(5);
        linkM.get(1);
        System.out.println(linkM);

        Map<Integer, String> lruCache = new SimpleLRUCache<>(2);
        lruCache.put(1, "a");
        lruCache.put(2, "b");
        lruCache.put(3, "c");

        lruCache.get(2);
        lruCache.put(9, "x");
        System.out.println(lruCache);

        // Object data = new Object();
        Map<Data, String > map = new WeakHashMap<>();
        Data data = new Data();
        map.put(data, "information");
        data = null;
        System.gc();
        int iteration = 0;
        for (int i = 1; i < 10000; i++) {
            iteration++;
            if (map.isEmpty()) {
                System.out.println("Empty! Count iterations = " + iteration);
                break;
            }

        }


    }
}
