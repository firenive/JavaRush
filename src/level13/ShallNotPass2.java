package level13;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class ShallNotPass2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // /home/max/TestCopy/Source/inputPoem.txt
        Path path = Paths.get(scan.nextLine());
        int countLine = 1;
        try {
            List<String> list = Files.readAllLines(path);
           for (int i = 0; i < list.size(); i++) {
               if (i % 2 ==0) System.out.println(list.get(i));
           }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
