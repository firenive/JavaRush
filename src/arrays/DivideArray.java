package arrays;

import java.util.Arrays;

public class DivideArray {
    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {
        int length = array.length;
        int halfLength = array.length/ 2;
        if (length %2 == 0) {
            result[0] = Arrays.copyOfRange(array, 0, halfLength);
            result[1] = Arrays.copyOfRange(array,halfLength, length);

        } else if (length % 2 != 0) {
            result[0] = Arrays.copyOfRange(array, 0, halfLength +1);
            result[1] = Arrays.copyOfRange(array,halfLength +1, length);
        }

        System.out.println(Arrays.deepToString(result));
    }
}
