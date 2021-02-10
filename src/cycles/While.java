package cycles;

import java.util.Scanner;

public class While {


    public static void main(String[] args) {
        int n = 0;
        int m = 0;

        while (n < 10) {
            while (m < 20) {
                if (n >= 1 && n < 9) {
                    if (m == 0 || m == 19) System.out.print("Б");
                    else System.out.print(" ");
                    m++;
                } else {
                    System.out.print("Б");
                    m++;
                }

            }
            m = 0;
            n++;
            System.out.println();
        }
    }


}



