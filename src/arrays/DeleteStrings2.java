package arrays;

import java.util.Scanner;

public class DeleteStrings2 {
    public static String[] strings;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        strings  =new String[] {"Java", "Java", "Hello", "Increment", "Decrement", "Hello", "World", "Integer", "Double", "Integer", "Android"};
//        for (int i = 0; i <strings.length; i++) {
//            strings[i] = scanner.nextLine();
//        }
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
        for (String s: strings) System.out.print(s + " ");
    }
}

