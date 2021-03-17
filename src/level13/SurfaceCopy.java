package level13;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class SurfaceCopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Path sourceDirectory = Path.of(scanner.nextLine());
        Path targetDirectory = Path.of(scanner.nextLine());
        Path copy = null;
        try (DirectoryStream<Path> directory = Files.newDirectoryStream(sourceDirectory)) {

            for (Path path : directory) {
                if (Files.isRegularFile(path)) {
                    if (sourceDirectory.toString().contains("\\")) {
                        copy = Path.of(targetDirectory.toString() + "\\" + path.getFileName());
                    } else  copy = Path.of(targetDirectory.toString() + "/" + path.getFileName());
                   // Files.createFile(targetDirectory);

                    Files.copy(path, copy);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

