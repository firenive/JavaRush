package level6;

public class Flags {
    public static int setFlag(int number, int flagPos) {
        //напишите тут ваш код
        number = number | (1 << flagPos);
        return number;
    }

    public static int resetFlag(int number, int flagPos) {
        //напишите тут ваш код
        number = number & ~(1 << flagPos);
        return number;
    }

    public static boolean checkFlag(int number, int flagPos) {
        boolean check = (number & (1 << flagPos)) == (1 << flagPos);
        //напишите тут ваш код
        return check;
    }


}
