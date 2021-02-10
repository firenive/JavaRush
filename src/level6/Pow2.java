package level6;

public class Pow2 {
    public static void main(String[] args) {
        System.out.println(getPowerOfTwo(3));
    }

    public static int getPowerOfTwo(int power) {
        int result = 2;
        for(int i = 0; i < power - 1; i++) {
            result = result << 1;
        }
        return result;
    }
}
