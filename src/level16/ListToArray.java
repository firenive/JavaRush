package level16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListToArray {
    public static void main(String[] args) {
        var strings = new ArrayList<String>();
        Collections.addAll(strings, "Ты", "ж", "программист");

        var integers = new ArrayList<Integer>();
        Collections.addAll(integers, 1000, 2000, 3000);
        System.out.println(Arrays.toString(toIntegerArray(integers)));
        System.out.println(Arrays.toString(toStringArray(strings)));

    }

    public static String[] toStringArray(ArrayList<String> strings) {

        return strings.toArray(String[]::new) ;
    }

    public static Integer[] toIntegerArray(ArrayList<Integer> integers) {

        return integers.toArray(Integer[]::new);
    }
}
