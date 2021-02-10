package functions;

public class RightOrder {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        //напишите тут ваш код
        int index = array.length -1;
        int halfLength = array.length / 2;
        int temp = 0;
        for (int i = 0; i < halfLength; i++) {
            temp = array[i];
            array[i] = array[index];
            array[index]= temp;
            index--;
        }

    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
