package level9;

public class Test {
    public static void main(String[] args) {
        String original = "Привет";
        char[] value = {'H', 'e', 'l', 'l', 'o'};
        int[] numbers = {1, 2, 10, 21, 34, 56, 454};
        String s = new String(numbers, 0 , 2);
        System.out.println(s);
    }
}

