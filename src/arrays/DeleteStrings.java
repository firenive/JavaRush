package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteStrings {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        strings = new String[10];
        for (int i = 0; i <strings.length; i++) {
            strings[i] = scanner.nextLine();
        }
        for (int i = 0; i < strings.length; i++) {
            String current = strings[i];
            for (int j = i + 1; j < strings.length; j++) {
                if (current == null) break;
                if (current.equals(strings[j])) {
                    strings[i] = null;
                    strings[j] = null;
                }
            }
        }
        Arrays.stream(strings).forEach(System.out::println);
    }
}
