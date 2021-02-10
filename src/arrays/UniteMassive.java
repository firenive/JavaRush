package arrays;

public class UniteMassive {
    public static void main(String[] args) {
        String[] firstArray = new String[] {"First", "Second", "Third", "Fourth", "Fifth"};
        String[] secondArray = new String[] {"Sixth", "Seventh", "Eighth", "Ninth", "Tenth"};
        for (String s: unite(firstArray, secondArray)) System.out.print(s + " ");
    }


    public static String[] unite(String[] first, String[] second) {
        String[] resultArray = new String[first.length + second.length];
        for (int f = 0; f < first.length; f++) {
            resultArray[f] = first[f];
        }
        int index = 0;
        for (int s = first.length; s < second.length + (first.length); s++) {
            resultArray[s] = second[index];
            index++;
        }
        return resultArray;

    }
}
