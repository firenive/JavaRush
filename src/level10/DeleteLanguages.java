package level10;

import java.util.ArrayList;
import java.util.Arrays;

public class DeleteLanguages {
    public static ArrayList<String> programmingLanguages =
            new ArrayList<>(Arrays.asList("C", "C++", "Python", "JavaScript", "Ruby", "Java", "Pascal"));

    public static void main(String[] args) {
        //напишите тут ваш код
        programmingLanguages.set(0, programmingLanguages.get(5));

        while (programmingLanguages.size() > 1) {
            programmingLanguages.remove(1);
        }
        System.out.println(programmingLanguages.toString());
    }
}
