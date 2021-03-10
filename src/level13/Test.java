package level13;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String pathSource = "/home/max/TestCopy/Source/Boston.jpg";
        String pathDest = "/home/max/TestCopy/Dest/secretary.jpg";
        try (Scanner scanner = new Scanner(System.in);
             var inputStream = Files.newInputStream(Paths.get(pathSource));
             var outputStream = Files.newOutputStream(Paths.get(pathDest))
        ) {
            int size = 1024;
            byte[] buffer = new byte[size];
            while (inputStream.available() > 0) {
                int read = inputStream.read();
                outputStream.write(buffer, size, read);
            }
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}
