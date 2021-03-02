package level11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorInForEach {
    public static void printList(ArrayList<String> words) {
    for (String s : words) System.out.println(s);
    }

    public static void printHashSet(HashSet<String> words) {
        Iterator<String> iterator = words.iterator();
        for (String s : words) System.out.println(s);
    }

    public static void main(String[] args) {
        String[] wordsArray = "Думаю, это будет новой фичей. Только не говорите никому, что она возникла случайно.".split(" ");
        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(wordsArray));
        HashSet<String> wordsHashSet = new HashSet<>(wordsList);
        printList(wordsList);
        System.out.println("__________________________________");
        printHashSet(wordsHashSet);
    }
}
