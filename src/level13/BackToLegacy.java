package level13;

import java.util.Locale;
import java.util.Scanner;

public class BackToLegacy {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String line = scanner.nextLine();
            System.out.println(line.toUpperCase(Locale.ROOT));
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}
