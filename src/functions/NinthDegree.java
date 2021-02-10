package functions;

public class NinthDegree {
    public static void main(String[] args) {
        System.out.println(cube(10));
        System.out.println(ninthDegree(10));
        System.out.println(Math.pow(10, 9));
    }
    public static long ninthDegree(long i) {
        i = cube(i);
        i = cube(i);
        return i;
    }
    public static long cube(long i) {
        return i * i * i;
    }
}
