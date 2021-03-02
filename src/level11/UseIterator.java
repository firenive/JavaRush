package level11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class UseIterator {
    public static void print(HashSet<String> words) {
        //напишите тут ваш код
        Iterator<String> iter = words.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
    }

    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>(Arrays.asList("Программированию обычно учат на примерах.".split(" ")));
        print(words);
    }

}
