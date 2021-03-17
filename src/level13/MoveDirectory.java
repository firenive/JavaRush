package level13;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class MoveDirectory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Path source = Path.of(scan.nextLine());
        Path dest = Path.of(scan.nextLine());

        try (DirectoryStream<Path> directory = Files.newDirectoryStream(source)) {
            for (Path path :directory) {
                if (Files.isRegularFile(path)) {
                    Path resolve = dest.resolve(path.getFileName());
                    Files.move(path, resolve);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
