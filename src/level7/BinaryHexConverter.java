package level7;

public class BinaryHexConverter {
    private static final String HEX = "0123456789abcdef";
    public static void main(String[] args) {
        String binaryNumber = "1001110100001";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        //напишите тут ваш код
        if (binaryNumber == null || binaryNumber.equals("")) return "";
        if (!binaryNumber.contains("0") || !binaryNumber.contains("1")) return "";
        if (binaryNumber.length() % 4 !=0) {
            int count = binaryNumber.length() % 4;
            if (count == 1) binaryNumber = "000" + binaryNumber;
            else if (count == 2) binaryNumber = "00" + binaryNumber;
            else if (count == 3) binaryNumber = "0" + binaryNumber;

        }

        return null;
    }

    public static String toBinary(String hexNumber) {
        //напишите тут ваш код
        if (hexNumber == null || hexNumber.equals("")) return "";
        for (int i = 0; i < hexNumber.length(); i++) {
            if (HEX.indexOf(hexNumber.charAt(i)) == -1) return "";
        }
        return null;
    }
}
