package arrays;

import java.util.Scanner;

public class Reverse2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
        }
        if (n % 2 == 0) {
            for (int i = numbers.length -1; i >=0; i--) System.out.println(numbers[i]);
        } else {
            for (int x : numbers) System.out.println(x);
        }
    }
}
