package level13;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class GetRoot {
    public static void main(String[] args) {
        // c:\\test\\test.txt
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Path path = Path.of(str).getRoot();
        System.out.println(path);
    }
}
