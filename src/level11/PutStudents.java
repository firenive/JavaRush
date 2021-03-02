package level11;

import java.util.HashMap;

public class PutStudents {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        //напишите тут ваш код
        grades.put("Евгений Борисов", 4.6);
        grades.put("Чарльз Макгилл", 5.0);
        grades.put("Ким Векслер", 4.9);
        grades.put("Джимми Макгилл", 4.0);
        grades.put("Майк Эрмантраут", 4.1);
    }
}

