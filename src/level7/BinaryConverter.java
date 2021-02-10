package level7;

public class BinaryConverter {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal("1100"));
    }

    public static String toBinary(int decimalNumber) {
        //напишите тут ваш код
        String stringBin = "";
        if (decimalNumber <= 0) return "";
        while (decimalNumber != 0) {
            stringBin = decimalNumber % 2 + stringBin;
            decimalNumber = decimalNumber / 2;
        }
        return stringBin;
    }

    public static int toDecimal(String binaryNumber) {
        //напишите тут ваш код
        int dec = 0;
        if (binaryNumber == null || binaryNumber.equals("")) return 0;

        for (int i = binaryNumber.length() - 1; i >= 0; i--) {
            dec = (int) (dec + ((Character.getNumericValue(binaryNumber.charAt(binaryNumber.length() - 1 - i))) * Math.pow(2, i)));
        }
        return dec;
    }
}
