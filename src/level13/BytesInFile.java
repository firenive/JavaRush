package level13;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class BytesInFile {
    public static void main(String[] args) throws IOException {
        byte[] bytes = args[0].getBytes();
        Scanner scanner = new Scanner(System.in);
        Path path = Paths.get(scanner.nextLine());
        try  {
            Files.write(path, bytes);
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}
