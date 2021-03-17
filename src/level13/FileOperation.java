package level13;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class FileOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Path filePath = Path.of(scanner.nextLine());
        Path fileNewPAth = Path.of(scanner.nextLine());

        try {
            if (Files.notExists(filePath)) Files.createFile(filePath);

            if (Files.notExists(fileNewPAth)) {
                Files.move(filePath, fileNewPAth);
            } else if (Files.exists(fileNewPAth)) Files.delete(filePath);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

