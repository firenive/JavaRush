package level12;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
    public static void main(String[] args) {
        push("first");
        push("second");
        try {
            push("third");
        } finally {

        }
        push("fourth");
        push("fifth");
        System.out.println(storage);
        pop();
        pop();
        System.out.println(storage);
    }
    private static final List<String> storage = new ArrayList<>();

    public static void push(String s) {
        //напишите тут ваш код
        storage.add(0, s);
    }

    public static String pop() {
        //напишите тут ваш код
        String first = storage.get(0);
        storage.remove(0);
        return first;
    }

    public static String peek() {
        //напишите тут ваш код
        String first = storage.get(0);
        return first;
    }

    public static boolean empty() {
        //напишите тут ваш код
        return storage.isEmpty();
    }

    public static int search(String s) {
        //напишите тут ваш код
        return storage.indexOf(s);
    }
}
