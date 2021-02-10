package arrays;

public class EvenNumber {
    public static void main(String[] args) {
        String[] array = even(10);
        for (String s : array) System.out.print(s + " ");
    }

    public static String[] even (int length) {
        String[] strings = new String[length];
        for (int i = 0; i < strings.length; i++) {
            if (i % 2 == 0) strings[i] = "Even";
            else strings[i] = "Odd";
        }
        return strings;
    }
}
