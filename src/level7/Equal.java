package level7;

public class Equal {
    public static void main(String[] args) {
        String first = new String("JavaRush");
        String second = new String("JavaRush");
        String third = new String("javarush");
        System.out.println(equal(first, second));
        System.out.println(equal(second, third));
    }

    public static boolean equal(String first, String second) {
        //напишите тут ваш код
        String t1 = first.intern();
        String t2 = second.intern();
        return t2 == t1;
        /*if (first.length() != second.length()) return false;
        for (int i = 0; i <first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) return  false;
        }
        return true;*/
    }
}
