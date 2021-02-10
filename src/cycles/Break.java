package cycles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int min;
        int min2;
        int number;
        while (scan.hasNextInt()) {
            number = scan.nextInt();
            numbers.add(number);
        }
        min = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            //System.out.println(numbers.get(i));
            if (min > numbers.get(i)) min = numbers.get(i);
        }
        min2 = min+ 1;
        for (int i = 0; i < numbers.size(); i++) {
            //System.out.println(numbers.get(i));
            if (min2 > numbers.get(i) && min != numbers.get(i)) min2 = numbers.get(i);
        }

        System.out.println(min2);
    }
}
