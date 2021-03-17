package level13;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class ShallNotPass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Path path = Paths.get(scan.nextLine());
        // /home/max/TestCopy/Source/inputPoem.txt

        try {
            List<String> lines = Files.readAllLines(path);
            for (String s :lines) {
                System.out.println(s.replaceAll("[\\.,\\s]" , ""));
            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
