package functions;

public class CubeCalculator {
    public static void main(String[] args) {
        System.out.println(cube(10));
    }
    public static long cube(long i) {
        return (long) Math.pow(i, 3);
    }
}
