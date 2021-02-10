package cycles.examples;

public class Triangle {
    public static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {
            int startCount = 11 - i;
            for (int s = 0; s < startCount; s++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
