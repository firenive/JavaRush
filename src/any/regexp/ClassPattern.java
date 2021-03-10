package any.regexp;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassPattern {
    public static void main(String[] args) {
        // проверка является ли переданная строка кодом цвета hex. Сначала в методе matches() передается паттерн, затем строка
        // Если строка подходит под паттерн возвращает true-
        if (Pattern.matches("^#?([a-f0-9]{6}|[a-f0-9]{3})$", "#8b2323")) {
            System.out.println(true);
        }
        Pattern pattern = Pattern.compile(":|;");
        String[] animals = pattern.split("cat:dog;bird:cow");
        Arrays.asList(animals).forEach(animal -> System.out.print(animal + " ")); // cat dog bird cow

        /*Matcher и MatchResult Matcher — класс, который представляет строку, реализует механизм согласования (matching)
         с РВ и хранит результаты этого  согласования (используя реализацию методов интерфейса MatchResult). Не имеет
         публичных конструкторов, поэтому для  создания объекта этого класса нужно использовать метод matcher класса Pattern:*/
        System.out.println("-");
        // ищем URL
        String regexp = "\"^(https?:\\\\/\\\\/)?([\\\\da-z\\\\.-]+)\\\\.([a-z\\\\.]{2,6})([\\\\/\\\\w \\\\.-]*)*\\\\/?$\";";
        String url = "https:habr.com/ru/post/260773";
        Pattern pattern1 = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(url);

        // IP адрес
        String regexpIP = "(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
        // сравнение работы методов сравнение regexp find() matches()
        String goodIp = "192.168.0.3";
        String badIp = "192.168.0.3g";

        // Но результатов у нас еще нет. Чтобы их получить нужно воспользоваться методом find. Можно использовать matches
        // — этот метод вернет true только тогда, когда вся строка соответствует заданному РВ, в отличии от find, который
        // пытается найти подстроку, которая удовлетворяет РВ.

        Pattern patternIP = Pattern.compile(regexpIP);
        Matcher matcherIP = patternIP.matcher(goodIp);
        System.out.println(matcherIP.matches() + "; " + matcherIP.find());
        // matches() - true, find() - false
        matcherIP = patternIP.matcher(badIp);
        System.out.println(matcherIP.matches() + "; " + matcherIP.find());
        // matches() - false, find() - true


        System.out.println(matcher.find() ?
                "I found '"+matcher.group()+"' starting at index "+matcher.start()+" and ending at index "+matcher.end()+"." :
                "I found nothing!");





    }
}
