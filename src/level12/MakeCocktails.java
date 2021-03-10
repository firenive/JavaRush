package level12;

public class MakeCocktails {
    public static final String OUTPUT_FORMAT = "Метод %s вызван из строки %d класса %s в файле %s.\n";

    public static void main(String[] args) {
        makeScrewdriver();
    }

    public static void printStackTrace(StackTraceElement[] stackTrace) {
        //напишите тут ваш код
        for (StackTraceElement info : stackTrace) {
            String method = info.getMethodName();
            int line = info.getLineNumber();
            String className = info.getClassName();
            String fileName = info.getFileName();
            System.out.printf(OUTPUT_FORMAT,method, line, className, fileName);
            /* Метод getStackTrace вызван из строки 1602 класса java.lang.Thread в файле Thread.java.
               Метод addVodka вызван из строки 36 класса level12.MakeCocktails в файле MakeCocktails.java.
               Метод addJuice вызван из строки 32 класса level12.MakeCocktails в файле MakeCocktails.java.
               Метод makeScrewdriver вызван из строки 28 класса level12.MakeCocktails в файле MakeCocktails.java.
               Метод main вызван из строки 7 класса level12.MakeCocktails в файле MakeCocktails.java. */
        }

    }

    static void makeScrewdriver() {
        addJuice();
    }

    static void addJuice() {
        addVodka();
    }

    static void addVodka() {
        printStackTrace(Thread.currentThread().getStackTrace());
    }
}
