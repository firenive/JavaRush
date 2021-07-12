package files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Prices2 {
    static List<String> dataFromFile = new ArrayList<>();



    // D:\java\table.txt
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        // if (args.length == 0) return;
        String path = "D:\\java\\table.txt";
        try (FileReader reader = new FileReader(path);
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                dataFromFile.add(line);
            }
//            if (args[0].equals("-u")) {
//                String data = args[1] + args[2] + args[3] + args[4] + "\n";
//                updateID(path, data, args[1]);
//            }
            // if (args[0].equals("-d")) {
             //   deleteID(path, "198479  ");
            //}
        }
    }


    public static void updateID(String path, String data, String id) {
        try (FileWriter writer = new FileWriter(path);
             BufferedWriter bufferWrite = new BufferedWriter(writer)) {

            for (int i = dataFromFile.size() -1; i >=0 ; i--) {
                String idFromFile = dataFromFile.get(i).substring(0,8);
                if (id.equals(idFromFile)) {
                    dataFromFile.set(i, data);
                }
            }
            for (String s : dataFromFile) bufferWrite.write(s);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void deleteID(String path, String id) {
        try (FileWriter writer = new FileWriter(path);
             BufferedWriter bufferWrite = new BufferedWriter(writer)) {

            for (int i = dataFromFile.size() -1; i >=0 ; i--) {
                String idFromFile = dataFromFile.get(i).substring(0,8);
                if (id.equals(idFromFile)) {
                    dataFromFile.remove(i);
                }

            }
            int iteration = 0;
            for (String s : dataFromFile) {
                if (iteration == 0) bufferWrite.write(s);
                else {
                    bufferWrite.write("\n" + s);
                }
                iteration++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
