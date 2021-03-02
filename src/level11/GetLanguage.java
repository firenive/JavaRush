package level11;

import java.util.ArrayList;
import java.util.HashMap;

public class GetLanguage {

    public static void main(String[] args) {
        System.out.println(getProgrammingLanguages());
    }

    public static HashMap<Integer, String> getProgrammingLanguages() {
        //напишите тут ваш код
        ArrayList<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Go");
        programmingLanguages.add("Javascript");
        programmingLanguages.add("Typescript");
        programmingLanguages.add("Python");
        programmingLanguages.add("PHP");
        programmingLanguages.add("C++");
        HashMap <Integer, String> languages = new HashMap<>();
        for (int i = 0; i < programmingLanguages.size(); i++) {
            languages.put(i, programmingLanguages.get(i));
        }
        return languages;
    }
}
