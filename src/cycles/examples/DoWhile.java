package cycles.examples;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String msg = scan.nextLine();
        int count = scan.nextInt();
        do {
            System.out.println(msg);
            count--;
        } while (count>0 && count <4);
    }
}
