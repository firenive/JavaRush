package level13;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class FileOrDirectory {
    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        Path path;
        try {
            while (true) {
                str = scanner.nextLine();
                path = Path.of(str);
                if (Files.isRegularFile(path)) System.out.println(path + THIS_IS_FILE);
                else if (Files.isDirectory(path)) System.out.println(path + THIS_IS_DIR);
                else break;
            }
        } catch (IllegalArgumentException e) {

        }
    }
}
