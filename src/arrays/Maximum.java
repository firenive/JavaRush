package arrays;

import java.util.Scanner;

public class Maximum {
    public static int[] array;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        array = new int[n];
        for (int i = 0; i <array.length; i++) {
            array[i] = scan.nextInt();
        }
        int min = array[0];
        for (int i = 1; i <array.length; i++) {
            if (array[i] < min) min = array[i];
        }
        System.out.println(min);
    }
}
