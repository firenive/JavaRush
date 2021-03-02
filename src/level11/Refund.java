package level11;

import java.util.HashSet;

public class Refund {
    public static void main(String[] args) {
        String[] array = {"Через", "три", "года", "я", "буду", "Senior", "Java", "Developer"};
        for(String s : array) {
            System.out.println(s);
        }
        System.out.println("___________________________________");

        HashSet<String> hashSet = arrayToHashSet(array);
        for(String s : hashSet) {
            System.out.println(s);
        }
    }

    public static HashSet<String> arrayToHashSet(String[] strings) {
        //напишите тут ваш код
        HashSet<String> result = new HashSet<>();
        for ( String s : strings) {
            result.add(s);
        }
        return result;
    }
}
