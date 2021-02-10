package cycles.examples;

import java.util.Scanner;

public class QuantityNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (scanner.hasNextInt()) count++;
            scanner.nextLine();
        }
        System.out.println(count);
    }
}
