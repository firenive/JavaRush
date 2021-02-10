package arrays;

import java.util.Scanner;

public class Create2DArray {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int column;
        multiArray = new int[row][];
        for (int i = 0; i < multiArray.length; i++) {
            column = scan.nextInt();
            multiArray[i] = new int[column];
        }


    }
}
