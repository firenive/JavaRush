package level16.rating;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Language> languages = new ArrayList<>();
        Collections.addAll(languages,
                new Language("С#", 4.58),
                new Language("JavaScript", 2.54),
                new Language("Python", 10.47),
                new Language("C++", 7.11),
                new Language("Go", 1.46),
                new Language("R", 2.37),
                new Language("Java", 13.48),
                new Language("C", 15.95),
                new Language("Swift", 1.38),
                new Language("PHP", 2.49));
        Stream<Language> languageStream = sortLambda(languages);
        languageStream.forEach(System.out::println);
    }

    public static Stream<Language> sortByRanking(ArrayList<Language> languages) {
        languages.sort(new Comparator<Language>() {
            @Override
            public int compare(Language o1, Language o2) {
                return Double.compare(o2.getRanking(), o1.getRanking());
            }
        });

        return languages.stream();
    }

    public static Stream<Language> sortLambda(ArrayList<Language> languages) {
        languages.sort(((o1, o2) -> Double.compare(o1.getRanking(), o2.getRanking())));
        return languages.stream();
    }
}
