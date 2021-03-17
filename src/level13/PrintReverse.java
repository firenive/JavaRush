package level13;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class PrintReverse {
    public static ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    public static PrintStream stream = new PrintStream(outputStream);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = scanner.nextLine();
        result = new StringBuilder(result).reverse().toString();
         printSomething(result);
         System.out.println(outputStream.toString());

    }

    public static void printSomething(String str) {
        stream.print(str);
    }
}
