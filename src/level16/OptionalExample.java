package level16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, "first", "second", null, "fourth", "fifth");
        printList(strings);

    }

    public static void printList(List<String> list) {
        String text = "Этот элемент = null";

        list.forEach(s -> System.out.println(Optional.ofNullable(s).orElse(text)));
    }
}
