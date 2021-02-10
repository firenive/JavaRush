package arrays;

public class ReverseSign {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        array = reverse(array);
        for (int i : array) System.out.print(i + " ");

    }

    static public int[] reverse(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = array[i] * -1;
            }
        }
        return array;
    }
}
