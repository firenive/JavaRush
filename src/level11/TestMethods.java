package level11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class TestMethods {
    private static ArrayList<Integer> list = new ArrayList<>();
    private static ArrayList<String> listString = new ArrayList<>();

    public static void main(String[] args) {
        Collections.addAll(list, 20, 16, 12, 0, -10, 30, 80, 17, 6);
        Collections.addAll(listString, "Привет", "Hello", "Hallo", "Alloha", "Salut");

        System.out.println(listString.toString());
        reverse(listString);
        System.out.println(listString.toString());

        System.out.println(list.toString());
        sort(list);
        System.out.println(list.toString());

        shuffle(list);
        System.out.println(list.toString());
        System.out.println(nCopies(5, "Hello").toString());
    }

    public static void addAll(ArrayList<Integer> list, Integer... integers) {
        for (Integer integer : integers) {
            list.add(integer);
        }
    }
    public static void fill (ArrayList<String> dest, String string) {
        for (int i = 0; i < dest.size(); i++) {
            dest.set(i, string);
        }
    }
    public static ArrayList<String> nCopies(int n, String obj) {
        ArrayList<String>  result = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            result.add(obj);
        }
        return result;
    }
    public static void copy (ArrayList<String> dest, ArrayList<String> src) {
        if (dest.size() < src.size()) {
            throw  new IndexOutOfBoundsException("Source does not fit in dest");
        }
        for (int i = 0; i < src.size(); i++) {
            dest.set(i, src.get(i));
        }
    }
    public static void replaceAll(ArrayList<String> list, String oldVal, String newVal) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(oldVal)) list.set(i , newVal);
        }
    }
    public static void reverse (ArrayList<String> list) {
        for (int i = 0, j = list.size() -1; i < list.size() /2; i++) {
            String string = list.get(i);
            list.set(i, list.get(j - i));
            list.set(j - i, string);
        }
    }
    public static void sort(ArrayList<Integer> list) {
        int n = list.size();
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (list.get(j -1) > list.get(j)) {
                    temp = list.get(j -1);
                    list.set(j -1, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }
    public static void rotate(ArrayList<Integer> list, int distance) {
        for (int i = 0; i < distance; i++) {
            list.add(0, list.get(list.size() - 1));
            list.remove(list.size() -1);
        }
    }
    public static void shuffle(ArrayList<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < list.size(); i++) {
            int randomIndexToSwap = random.nextInt(list.size());
            int temp = list.get(randomIndexToSwap);
            list.set(randomIndexToSwap, list.get(i));
            list.set(i, temp);
        }
    }
    public static Integer max (ArrayList<Integer> list) {
        Integer max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) max = list.get(i);
        }
        return max;
    }
    public static Integer min (ArrayList<Integer> list) {
        Integer min = list.get(0);
        for (int i = 1; i <list.size(); i++) {
            if (list.get(i) < min) min = list.get(i);
        }
        return min;
    }
    public static int frequency(ArrayList<String> list, String element) {
        int frequency = 0;
        if (element == null) {
            for (String s : list) {
                if (s == null) frequency++;
            }
        } else for (String s: list) {
            if (s.equals(element)) frequency++;
        }
        return frequency;
    }
    public static int binarySearch(ArrayList<Integer> list, Integer key) {
        int low = 0;
        int high = list.size() -1;
        int mid = (low + high) / 2;
        int index = -1;
        while (low <= high) {
            if (list.get(mid) < key) {
                low = mid +1;
            }
            else if (list.get(mid).equals( key)) {
                index = mid;
                break;
            } else high = mid -1;
            mid = (low + high) / 2;
        }
        return index;

    }
}
