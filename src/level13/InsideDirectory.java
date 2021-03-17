package level13;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class InsideDirectory {

    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Path directory = Path.of(scanner.nextLine());
        //напишите тут ваш код
        try (DirectoryStream<Path> files = Files.newDirectoryStream(directory)) {
            for (Path path: files) {
                if (Files.isRegularFile(path)) System.out.println(path + THIS_IS_FILE);
                else if (Files.isDirectory(path)) System.out.println(path + THIS_IS_DIR);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
