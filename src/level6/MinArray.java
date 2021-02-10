package level6;

import java.util.Scanner;

public class MinArray {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        int min= ints[0];
        for (int i = 1; i <ints.length; i++) {
            min = Math.min(min, ints[i]);
        }
        return min;
    }

    public static int[] getArrayOfTenElements() {
        //напишите тут ваш код
        int[] array = new int[10];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i <10; i++) {
            array[i] = scan.nextInt();
        }
        return array;
    }
}
