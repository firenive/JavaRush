package level7;

public class Format {
    public static void main(String[] args) {
        System.out.println(format("Амиго", 5000));
    }

    public static String format(String name, int salary) {
        String phrase = String.format("Меня зовут %s. Я буду зарабатывать $%d в месяц.", name, salary);
        //напишите тут ваш код
        return phrase;
    }
}
