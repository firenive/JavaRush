package level7;

public class OctalConverter {
    public static void main(String[] args) {
        int decimalNumber = -10;
        System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
        int octalNumber = -10;
        System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        //напишите тут ваш код
        if (decimalNumber <= 0) return 0;
        int i = 0;
        int octal = 0;
        while (decimalNumber != 0) {
            octal = octal + (decimalNumber % 8 ) * ((int) Math.pow(10, i));
            decimalNumber =decimalNumber / 8;
            i++;
        }
        return octal;
    }

    public static int toDecimal(int octalNumber) {
        //напишите тут ваш код
        if (octalNumber <= 0) return 0;
        int i = 0;
        int dec = 0;
        while (octalNumber !=0) {
            dec = dec + (octalNumber % 10 ) * ((int) Math.pow(8, i));
            octalNumber = octalNumber / 10;
            i++;
        }
        return dec;
    }
}
