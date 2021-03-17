package level13;

import java.nio.file.Path;
import java.util.Scanner;

public class AbsolutePath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringPath = scanner.nextLine();
        Path path = Path.of(stringPath);
        if (!path.isAbsolute()) path = path.toAbsolutePath();
        System.out.println(path);
    }
}
