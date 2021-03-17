package level13;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class MixedBytes {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in);
             var inputStream = Files.newInputStream(Paths.get(scan.nextLine()));
             var outputStream = Files.newOutputStream(Paths.get(scan.nextLine()))) {
            byte[] bytesIn = inputStream.readAllBytes();
            byte[] bytesOut = new byte[bytesIn.length];

            byte temp;
            for (int i = 0; i < bytesIn.length; i += 2) {
                if (i < bytesIn.length - 1) {
                    bytesOut[i] = bytesIn[i + 1];
                    bytesOut[i + 1] = bytesIn[i];
                } else bytesOut[i] = bytesIn[i];

            }
            outputStream.write(bytesOut);

        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}
