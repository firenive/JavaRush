package level7;

public class HexConverter {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        //напишите тут ваш код
        String hexNumber = "";
        if (decimalNumber <= 0) return "";
        while (decimalNumber != 0) {
            hexNumber = HEX.ind
        }
        return null;
    }

    public static int toDecimal(String hexNumber) {
        //напишите тут ваш код
        if (hexNumber == null || hexNumber.equals("")) return 0;

        return 0;
    }
}
