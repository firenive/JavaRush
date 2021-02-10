package arrays;

import java.util.Arrays;

public class ArraysFill {
    public static int[] array = new int[5];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        int length;
        if (array.length % 2 == 0){
            length = array.length / 2;
            Arrays.fill(array,0, length, valueStart);
            Arrays.fill(array,length, array.length , valueEnd);
        } else if(array.length % 2 != 0) {
            length = array.length /2;
            Arrays.fill(array,0, length +1, valueStart);
            Arrays.fill(array,length+1, array.length, valueEnd);
        }

        System.out.println(Arrays.toString(array));
    }
}
