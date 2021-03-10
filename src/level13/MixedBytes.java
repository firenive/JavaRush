package level13;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class MixedBytes {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in);
        var inputStream = Files.newInputStream(Paths.get(scan.nextLine()));
        var outputStream = Files.newOutputStream(Paths.get(scan.nextLine()))) {


        } catch (IOException e) {

        }
    }
}
