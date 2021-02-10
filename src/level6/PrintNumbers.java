package level6;

public class PrintNumbers {
    public static void main(String[] args) throws InterruptedException {
        printNumbers();
    }

    public static void printNumbers() throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i == 10) break;
            Thread.sleep(1, 300_000);
        }
    }
}
