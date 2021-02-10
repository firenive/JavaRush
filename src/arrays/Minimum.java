package arrays;

public class Minimum {
    public static void main(String[] args) {
        int[] numbers = new int[] {15,20, 4, 7, 69, 70, 32 ,1};
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) min = numbers[i];
        }
        System.out.println(min);
    }
}
