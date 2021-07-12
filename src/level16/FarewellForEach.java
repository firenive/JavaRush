package level16;

import java.util.ArrayList;
import java.util.Collections;

public class FarewellForEach {
    public static void main(String[] args) {
        var strings = new ArrayList<String>();
        Collections.addAll(strings, "Hello", "Amigo", "JavaRush", "CodeGym");

    }

    public static void print(ArrayList<String> strings) {
        for (int i = 0; i < strings.size(); i++) System.out.println(strings.get(i));
    }
}
