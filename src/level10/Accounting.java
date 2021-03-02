package level10;

import java.util.ArrayList;

public class Accounting {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвинно");
        waitingEmployees.add("Гунигерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Нифрод");
        waitingEmployees.add("Альбиуф");
        waitingEmployees.add("Иногрим");
        waitingEmployees.add("Фриле");
    }

    public static void main(String[] args) {
        initEmployees();
        paySalary("Максим");
        System.out.println(waitingEmployees.toString());
        System.out.println(alreadyGotSalaryEmployees.toString());
    }

    public static void paySalary(String name) {
        //напишите тут ваш код
        if (name != null) {
            for (int i = 0; i < waitingEmployees.size(); i++) {
                if (waitingEmployees.get(i).equals(name)) {
                    alreadyGotSalaryEmployees.add(waitingEmployees.get(i));
                    waitingEmployees.set(i, null);
                }
            }
        }

    }

}
