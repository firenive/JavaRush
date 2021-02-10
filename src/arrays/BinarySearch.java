package arrays;

import java.util.Arrays;

public class BinarySearch {
    public static int[] array = {9, 8, 7, 6, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
        int[] copyArray = Arrays.copyOf(array, array.length);
        Arrays.sort(copyArray);
        if (Arrays.binarySearch(copyArray, element) >= 0) System.out.println(true);
        else System.out.println(false);
    }

}
