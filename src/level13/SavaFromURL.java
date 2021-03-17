package level13;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;
import java.util.Scanner;

public class SavaFromURL {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            URL url = new URL(scan.nextLine());

            InputStream input = url.openStream();
            byte[] buffer = input.readAllBytes();
            Random random = new Random();

            Path temp = Files.createTempFile(null, null);
            System.out.println(temp);
            Files.write(temp,buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
