package level9;

public class ParseDouble {
    public static void main(String[] args) {
        String string = "12.84";
        double value = Math.round(Double.parseDouble(string));
        System.out.println((int) value);
    }
}
