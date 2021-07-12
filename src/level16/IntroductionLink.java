package level16;

import java.util.ArrayList;
import java.util.Collections;

public class IntroductionLink {
    public static void main(String[] args) {
        var strings = new ArrayList<String>();
        Collections.addAll(strings, "Hello", "Amigo", "JavaRush", "CodeGym");

    }

    public static void print(ArrayList<String> list) {
        list.forEach(System.out::println);
    }
}
